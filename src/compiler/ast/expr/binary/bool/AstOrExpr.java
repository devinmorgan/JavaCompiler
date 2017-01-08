package compiler.ast.expr.binary.bool;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.binary.AstBinaryExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstOrExpr extends AstBinaryExpr {
    public AstOrExpr(int line, int col,
                     AstExpr leftArg,
                     String operator,
                     AstExpr rightArg) {
        super(line, col, leftArg, operator, rightArg);
    }
}