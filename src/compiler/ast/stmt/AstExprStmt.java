package compiler.ast.stmt;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstExprStmt extends AstStmt {
    final AstExpr expr;

    public AstExprStmt(AstExpr expr) {
        super(expr.getLine(), expr.getCol());
        this.expr = expr;
    }
}
