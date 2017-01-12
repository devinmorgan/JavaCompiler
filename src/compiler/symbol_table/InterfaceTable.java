package compiler.symbol_table;

import compiler.ast.AstMethodSig;
import compiler.ast.type.AstType;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by devinmorgan on 1/11/17.
 */
public class InterfaceTable {
    final String name;
    final SymbolTable symbolTable;
    final HashMap<Function, AstType> functions = new HashMap<>();
    final HashSet<ClassTable> allKnownImplementingClasses = new HashSet<>();

    public String getName() {
        return this.name;
    }

    public HashMap<Function, AstType> getFunctions() {
        return this.functions;
    }

    public InterfaceTable(String name, SymbolTable symbolTable) {
        this.name = name;
        this.symbolTable = symbolTable;
    }

    public void addFunction(AstMethodSig methodSig, StringBuilder errorMessage) {
        Function function = new Function(methodSig.getName(), methodSig.getParams());

        // only add a function if it has not already been declared
        if (this.functions.containsKey(function)) {
            String message = "Duplicate method signature (same name " +
                    "and same args) found in interface " + this.name + ". Line: " + methodSig.getLine();
            errorMessage.append(message);
        }
        else {
            this.functions.put(function, methodSig.getReturnType());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InterfaceTable) {
            InterfaceTable that = (InterfaceTable) obj;

            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
