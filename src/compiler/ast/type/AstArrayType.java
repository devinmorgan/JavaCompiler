package compiler.ast.type;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArrayType extends AstNonVoidType {
    final AstNonVoidType type;
    final int dimensions;

    public AstArrayType(int line, int col, AstNonVoidType type, int dimensions) {
        super(line, col);
        this.type = type;
        this.dimensions = dimensions;
    }

}
