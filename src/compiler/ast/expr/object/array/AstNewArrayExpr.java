package compiler.ast.expr.object.array;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstType;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstNewArrayExpr extends AstExpr {
    final AstType type;
    final ArrayList<AstArrayStruct> dimensions;

    public AstNewArrayExpr(AstType type, ArrayList<AstArrayStruct> dimensions) {
        super(type.getLine(), type.getCol());
        this.type = type;
        this.dimensions = dimensions;
    }
}
