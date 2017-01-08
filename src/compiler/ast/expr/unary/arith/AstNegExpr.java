package compiler.ast.expr.unary.arith;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.unary.AstUnaryExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstNegExpr extends AstUnaryExpr {
    public AstNegExpr(int line, int col, AstExpr arg) {
        super(line, col, arg);
    }
}
