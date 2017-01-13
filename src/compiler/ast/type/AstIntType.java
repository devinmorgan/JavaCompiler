package compiler.ast.type;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIntType extends AstNonVoidType {
    public AstIntType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstIntType;
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        return;
    }
}
