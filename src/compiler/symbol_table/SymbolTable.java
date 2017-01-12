package compiler.symbol_table;

import compiler.ast.AstInterfaceUse;
import compiler.ast.AstMethodSig;
import compiler.ast.decl.*;
import compiler.ast.type.AstType;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by devinmorgan on 1/11/17.
 */
public class SymbolTable {
    final HashMap<String, AstType> globalVars = new HashMap<>();
    final HashMap<Function, AstType> staticFunctions = new HashMap<>();
    final HashMap<String, ClassTable> classes = new HashMap<>();
    final HashMap<String, InterfaceTable> interfaces = new HashMap<>();
    final HashMap<String, AstType> localVariableScope = new HashMap<>();

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

    public void configureSymbolTable(StringBuilder errorMessage) {
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




























