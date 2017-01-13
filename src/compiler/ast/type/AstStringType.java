package compiler.ast.type;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstStringType extends AstNonVoidType {
    public AstStringType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "String";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstStringType;
    }

    @Override
    public int hashCode() {
        return 17;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        return;
    }
}
