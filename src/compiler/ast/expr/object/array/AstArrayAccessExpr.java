package compiler.ast.expr.object.array;

import compiler.ast.expr.AstExpr;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstArrayAccessExpr extends AstExpr {
    final ArrayList<AstArrayStruct> offsetArgs;
    final AstExpr arrayObject;

    public AstArrayAccessExpr(AstExpr arrayObject, ArrayList<AstArrayStruct> offsetArgs) {
        super(arrayObject.getLine(), arrayObject.getCol());
        this.offsetArgs = offsetArgs;
        this.arrayObject = arrayObject;
    }
}
