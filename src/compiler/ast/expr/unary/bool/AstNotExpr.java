package compiler.ast.expr.unary.bool;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.unary.AstUnaryExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstNotExpr extends AstUnaryExpr {
    public AstNotExpr(int line, int col, AstExpr arg) {
        super(line, col, arg);
    }
}
