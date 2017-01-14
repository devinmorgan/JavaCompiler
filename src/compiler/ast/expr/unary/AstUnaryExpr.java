package compiler.ast.expr.unary;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstUnaryExpr extends AstExpr{
    public final AstExpr arg;

    public AstUnaryExpr(int line, int col, AstExpr arg) {
        super(line, col);
        this.arg = arg;
    }

    public class UnaryExpressionArgumentMismatch extends RuntimeException {
        public UnaryExpressionArgumentMismatch(AstType expectedType, AstType foundType) {
            super("Expected type  " + expectedType + " but found type " + foundType + "\n");
        }
    }
}
