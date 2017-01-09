package compiler.ast.expr.binary.arith;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.binary.AstBinaryExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstAdditiveExpr extends AstBinaryExpr {
    public AstAdditiveExpr(AstExpr leftArg, String operator, AstExpr rightArg) {
        super(leftArg.getLine(), leftArg.getCol(), leftArg, operator, rightArg);
    }
}
