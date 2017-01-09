package compiler.ast.type;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArrayType extends AstNonVoidType {
    final AstNonVoidType type;
    final int dimensions;

    public AstArrayType(AstNonVoidType type, int dimensions) {
        super(type.getLine(), type.getCol());
        this.type = type;
        this.dimensions = dimensions;
    }

}
