package compiler.ast.expr.object.array;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstNewArrayExpr extends AstExpr {
    final AstType type;
    final AstArrayStruct dimensions;

    public AstNewArrayExpr(int line, int col, AstType type, AstArrayStruct dimensions) {
        super(line, col);
        this.type = type;
        this.dimensions = dimensions;
    }
}
