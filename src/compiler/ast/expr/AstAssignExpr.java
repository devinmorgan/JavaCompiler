package compiler.ast.expr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstAssignExpr extends AstExpr{
    final AstExpr storeLoc;
    final AstExpr value;

    public AstAssignExpr(AstExpr storeLoc, AstExpr value) {
        super(storeLoc.getLine(), storeLoc.getCol());
        this.storeLoc = storeLoc;
        this.value = value;
    }
}
