package compiler.ast.expr;

import compiler.ast.Ast;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstExpr extends Ast {
    public AstExpr(int line, int col) {
        super(line, col);
    }

    public abstract AstType getType();

    public class BinaryExpressionTypeMismatch extends RuntimeException {
        public BinaryExpressionTypeMismatch(AstType lhsType, AstType rhsType) {
            super("LHS is of type " + lhsType.toString() + " but RHS is of type " + rhsType.toString());
        }
    }
}
