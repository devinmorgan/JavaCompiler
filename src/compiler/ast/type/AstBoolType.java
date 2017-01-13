package compiler.ast.type;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstBoolType extends AstNonVoidType {
    public AstBoolType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "boolean";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstBoolType;
    }

    @Override
    public int hashCode() {
        return 13;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        return;
    }
}
