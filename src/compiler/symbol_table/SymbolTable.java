package compiler.symbol_table;

import compiler.ast.AstInterfaceUse;
import compiler.ast.AstMethodSig;
import compiler.ast.decl.*;
import compiler.ast.type.AstNonVoidType;
import compiler.ast.type.AstType;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by devinmorgan on 1/11/17.
 */
public class SymbolTable {
    final HashMap<String, AstNonVoidType> globalVars = new HashMap<>();
    final HashMap<Function, AstType> staticFunctions = new HashMap<>();
    final HashMap<String, ClassTable> classes = new HashMap<>();
    final HashMap<String, InterfaceTable> interfaces = new HashMap<>();
    final Stack<Scope> scopeStack = new Stack<>();

    /*---------------------------Build Symbol Table Functions---------------------------*/

    public void addNewGlobalVariable(AstVarDecl varDecl, StringBuilder errorMessage) {
        String varName = varDecl.getName();

        // only add the global var if it has not already been declared
        if (this.globalVars.containsKey(varName)) {
            String message = "Duplicate global variables named "
                    + varName + " found. Line " + varDecl.getLine() + "\n";
            errorMessage.append(message);
        }
        else {
            this.globalVars.put(varName, varDecl.getType());
        }
    }

    public void addNewClass(AstClassDecl classDecl, StringBuilder errorMessage) {
        String className = classDecl.getClassName();

        // only add the class if it has not already been declared
        if (this.classes.containsKey(className)) {
            String message = "Duplicate classes named " + className + ". Line: " + classDecl.getLine() + "\n";
            errorMessage.append(message);
        }
        else {
            // create a class table for the class
            ClassTable classTable = new ClassTable(classDecl.getClassName(), this);

            // add the parent class (if there is one)
            if (classDecl.getParentClass() != null) {
                classTable.setParentClass(classDecl.getParentClass(), errorMessage);
            }

            // add all the interfaces (if there are any)
            for (AstInterfaceUse interfaceUse : classDecl.getImplementedInterfaces().getInterfacesList()) {
                classTable.addInterface(interfaceUse.getName(), errorMessage);
            }

            // add fields and functions to the class table and check for duplicates
            for (AstDecl decl : classDecl.getDeclsList()) {
                if (decl instanceof AstVarDecl) {
                    classTable.addClassField((AstVarDecl) decl, errorMessage);
                }
                else { // its an AstFuncDecl
                    classTable.addClassFunction((AstFuncDecl) decl, errorMessage);
                }
            }

            // add the classTable to classes
            this.classes.put(className, classTable);
        }
    }

    public void addNewInterface(AstInterfaceDecl interfaceDecl, StringBuilder errorMessage) {
        String interfaceName = interfaceDecl.getName();

        // only add the interface if it has not already been declared
        if (this.interfaces.containsKey(interfaceName)) {
            String message = "Duplicate interfaces named " + interfaceName +
                    " declared. Line: " + interfaceDecl.getLine() + "\n";
            errorMessage.append(message);
        }
        else {
            // create an InterfaceTable
            InterfaceTable interfaceTable = new InterfaceTable(interfaceDecl.getName(), this);

            // add all the method signatures to the interface table and check for duplicates
            for (AstMethodSig methodSig : interfaceDecl.getMethodSigs()) {
                interfaceTable.addFunction(methodSig, errorMessage);
            }

            // add the InterfaceTable to interfaces
            this.interfaces.put(interfaceName, interfaceTable);
        }

    }

    public void addNewStaticFunction(AstFuncDecl funcDecl, StringBuilder errorMessage) {
        Function function = new Function(funcDecl.getName(), funcDecl.getParams());

        // only add to static functions if it has not already been declared
        if (this.staticFunctions.containsKey(function)) {
            String message = "Duplicate function declaration of " + funcDecl.getName()
                    + " (matching name and parameters). Line: " + funcDecl.getLine() + "\n";
            errorMessage.append(message);
        }
        else {
            this.staticFunctions.put(function, funcDecl.getReturnType());
        }
    }

    /*---------------------------Semantic Check Functions---------------------------*/

    public AstType getReturnTypeOfStaticFunction(Function function) {
        if (this.staticFunctions.containsKey(function)) {
            return this.staticFunctions.get(function);
        }
        return null;
    }

    public boolean isIdADeclaredClassOrInterface(String id) {
        return (this.classes.containsKey(id) || this.interfaces.containsKey(id));
    }

    /**
     *
     * @param name name of the variable to add to the local scope
     * @param type AstType of the variable to add to the local scope
     * @param errorMessage StringBuilder that contains the cumulative
     *                     error message from the semantic analysis
     * @return true if the variable was successfully added to the local
     * scope. false if a duplicate variable already exists in the local
     * scope
     */
    public boolean addVariableDeclarationToLocalScope(String name,
                                                      AstType type,
                                                      StringBuilder errorMessage) {
        if (this.scopeStack.peek().variables.containsKey(name)) {
            String message = "Duplicate declaration of variable with name "
                    + name + ". Line: " + type.getLine() + "\n";
            errorMessage.append(message);
            return false;
        }
        else {
            this.scopeStack.peek().variables.put(name, type);
            return true;
        }
    }

    public void checkClassesForSemanticErrors(StringBuilder errorMessage) {
        for (String curClassName : this.classes.keySet()) {
            ClassTable curClassTable = this.classes.get(curClassName);

            // semantic checks for parent classes
            while (curClassTable.parentName != null) {

                // make sure that the parent class was declared
                if (! this.classes.containsKey(curClassTable.parentName)) {
                    String message = "Class " + curClassName + " inherits from class "
                            + curClassTable.parentName + ", which was not declared.\n";
                    errorMessage.append(message);
                    break;
                }

                // make sure there is no cyclic inheritance
                else if (curClassTable.parentName.equals(curClassName)) {
                    String message = "Cyclic inheritance detected between classes "
                            + curClassName + " and " + curClassTable.name + "\n";
                    errorMessage.append(message);
                    break;
                }

                // next, consider this class's parent
                curClassTable = this.classes.get(curClassTable.parentName);
            }

            // semantic checks for interfaces
            ClassTable table = this.classes.get(curClassName);
            for (String interfaceName : table.getInterfaces()) {

                // verify that the interface has already been declared
                if (! this.interfaces.containsKey(interfaceName)) {
                    String message = "Class " + table.name + " implements interface "
                            + interfaceName + ", which has not been declared\n";
                    errorMessage.append(message);
                }
                else {
                    InterfaceTable interfaceTable = this.interfaces.get(interfaceName);

                    // verify that curClassTable implements all of the functions required
                    for (Function interfaceFunc : interfaceTable.getFunctions().keySet()) {

                        // the function is just not declared
                        if (! table.functions.containsKey(interfaceFunc)) {
                            String message = "Class " + curClassName + " does not implement " +
                                    "all required methods for interface " + interfaceName + "\n";
                            errorMessage.append(message);
                            break;
                        }

                        // the function is declared but has the wrong return type
                        AstType classFuncReturnType = table.functions.get(interfaceFunc);
                        AstType interfaceFuncReturnType = interfaceTable.functions.get(interfaceFunc);
                        if (! classFuncReturnType.equals(interfaceFuncReturnType)) {
                            String message = "Class " + curClassName + " does not implement " +
                                    "all required methods for interface " + interfaceName + "\n";
                            errorMessage.append(message);
                        }
                    }
                }

            }
        }
    }

    public void pushNewScope() {
        this.scopeStack.push(new Scope());
    }

    public void pushNewFunctionScope(AstType returnType) {
        this.scopeStack.push(new Scope(returnType));
    }

    public void pushNewClassScope(String className) {
        this.scopeStack.push(new Scope(className));
    }

    public void popLocalScope() {
        this.scopeStack.pop();
    }

    public AstType getCurrentScopeReturnType() {
        return this.scopeStack.peek().returnType;
    }

    public void enterLoop() {
        this.scopeStack.peek().enterLoop();
    }

    public void exitLoop() {
        this.scopeStack.peek().exitLoop();
    }

    public boolean isCurrentlyInALoop() {
        return this.scopeStack.peek().currentlyInALoop;
    }

    public AstType lookupVariableType(String varName) {
        // look through the scope stacks until the first instance
        // of the variable is found
        for (Scope scope : this.scopeStack) {
            if (scope.variables.containsKey(varName)) {
                return scope.variables.get(varName);
            }
        }
        return null;
    }

    public String getNameOfCurrentClass() {
        // look through the scopes to find one with a className
        for (Scope scope : this.scopeStack) {
            if (scope.className != null) {
                return scope.className;
            }
        }
        return null;
    }

    public AstNonVoidType getTypeForFieldOfClass(String varName, String className) {
        ClassTable classTable = this.classes.get(className);
        return classTable.fields.get(varName);
    }

}




























