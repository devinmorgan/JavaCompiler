package compiler.ast.expr.binary;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstBinaryExpr extends AstExpr{
    final AstExpr leftArg;
    final String operator;
    final AstExpr rightArg;

    public AstBinaryExpr(int line, int col,
                         AstExpr leftArg,
                         String operator,
                         AstExpr rightArg) {
        super(line, col);
        this.leftArg = leftArg;
        this.operator = operator;
        this.rightArg = rightArg;
    }
}
