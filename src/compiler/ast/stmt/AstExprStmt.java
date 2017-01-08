package compiler.ast.stmt;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstExprStmt extends AstStmt {
    final AstExpr expr;

    public AstExprStmt(int line, int col, AstExpr expr) {
        super(line, col);
        this.expr = expr;
    }
}
