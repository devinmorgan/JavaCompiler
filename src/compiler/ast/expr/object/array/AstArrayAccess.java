package compiler.ast.expr.object.array;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstArrayAccess extends AstExpr {
    final AstArrayStruct offsetArgs;
    final AstExpr arrayObject;

    public AstArrayAccess(int line, int col, AstArrayStruct offsetArgs, AstExpr arrayObject) {
        super(line, col);
        this.offsetArgs = offsetArgs;
        this.arrayObject = arrayObject;
    }
}
