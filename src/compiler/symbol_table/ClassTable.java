package compiler.symbol_table;

import compiler.ast.decl.AstFuncDecl;
import compiler.ast.decl.AstVarDecl;
import compiler.ast.type.AstType;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by devinmorgan on 1/11/17.
 */
public class ClassTable {
    final SymbolTable symbolTable;
    final String name;
    String parentName;
    final HashSet<String> interfaces = new HashSet<>();
    final HashSet<ClassTable> children = new HashSet<>();
    final HashMap<Function, AstType> functions = new HashMap<>();
    final HashMap<String, AstType> fields = new HashMap<>();

    public ClassTable(String name, SymbolTable symbolTable) {
        this.name = name;
        this.symbolTable = symbolTable;
    }

    public void setParentClass(String parentName, StringBuilder errorMessage) {
        // only set as parent if parentName is not this class
        if (parentName.equals(this.name)) {
            String message = "Cyclical inheritance. Class " + this.name + " cannot extend itself.";
            errorMessage.append(message);
        }
        else {
            this.parentName = parentName;
        }
    }

    public void addInterface(String interfaceName, StringBuilder errorMessage) {
        // only add the interface if it has not already been added
        if (this.interfaces.contains(interfaceName)) {
            String message = "Class " + this.name + " implements " + interfaceName + " multiple times.\n";
            errorMessage.append(message);
        }
        else {
            this.interfaces.add(interfaceName);
        }
    }

    public void addChildClass(ClassTable childClass) {
        this.children.add(childClass);
    }

    public void addClassFunction(AstFuncDecl funcDecl, StringBuilder errorMessage) {
        // create the Function from the AstFuncDecl
        Function func = new Function(funcDecl.getName(), funcDecl.getParams());

        // only add the function if it has not already been declared
        if (this.functions.containsKey(func)) {
            String message = "Duplicate function declaration (same name " +
                    "and same args) found. Line: " + funcDecl.getLine();
            errorMessage.append(message);
        }
        else {
            this.functions.put(func, funcDecl.getReturnType());
        }
    }

    public void addClassField(AstVarDecl varDecl, StringBuilder errorMessage) {
        String varName = varDecl.getName();

        // only add the field to the class if it has not already been declared
        if (this.fields.containsKey(varName)) {
            String message = "Duplicate fields declared with name "
                    + varName + ". Line: " + varDecl.getLine() + "\n";
            errorMessage.append(message);
        }
        else {
            this.fields.put(varName, varDecl.getType());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClassTable) {
            ClassTable that = (ClassTable) obj;
            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
