package compiler.ast.stmt;

import compiler.ast.expr.AstExpr;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstExprStmt extends AstStmt {
    final AstExpr expr;

    public AstExprStmt(AstExpr expr) {
        super(expr.getLine(), expr.getCol());
        this.expr = expr;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        this.expr.performSemanticAnalysis(environment, errorMessage);
    }
}
