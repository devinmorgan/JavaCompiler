package compiler.ast.expr;

import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParentheticalExpr extends AstExpr {
    final AstExpr value;

    public AstParentheticalExpr(int line, int col, AstExpr value) {
        super(line, col);
        this.value = value;
    }

    @Override
    public AstType getType() {
        return this.value.getType();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        this.value.performSemanticAnalysis(environment, errorMessage);
    }
}
