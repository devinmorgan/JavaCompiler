package compiler.ast.type;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVoidType extends AstType{
    public AstVoidType(int line, int col) {
        super(line, col);
    }

    @Override
    public String toString() {
        return "void";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstVoidType;
    }

    @Override
    public int hashCode() {
        return 19;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        return;
    }
}
