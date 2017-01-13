package compiler.ast.decl;

import compiler.ast.AstMethodSig;
import compiler.symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceDecl extends AstDecl {
    final String name;
    final HashSet<AstMethodSig> methodSigs;

    public AstInterfaceDecl(int line, int col,
                            String name,
                            HashSet<AstMethodSig> methodSigs) {
        super(line, col);
        this.name = name;
        this.methodSigs = methodSigs;
    }

    public String getName() {
        return this.name;
    }

    public HashSet<AstMethodSig> getMethodSigs() {
        return this.methodSigs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstInterfaceDecl) {
            AstInterfaceDecl that = (AstInterfaceDecl) obj;

            // no 2 interfaces can have the same name
            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // validate each of the method signatures individually
        for (AstMethodSig methodSig : this.methodSigs) {
            methodSig.performSemanticAnalysis(environment, errorMessage);
        }
    }
}
