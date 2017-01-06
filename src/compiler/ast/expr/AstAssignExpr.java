package compiler.ast.expr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstAssignExpr extends AstExpr{
    final AstExpr storeLoc;
    final AstExpr value;
}
