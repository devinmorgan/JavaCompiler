package compiler.ast.expr.unary;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstUnaryExpr extends AstExpr{
    final AstExpr arg;

    public AstUnaryExpr(int line, int col, AstExpr arg) {
        super(line, col);
        this.arg = arg;
    }
}
