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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstArrayType) {
            AstArrayType that = (AstArrayType) obj;

            return this.type.equals(that.type)
                    && this.dimensions == that.dimensions;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.dimensions * this.type.hashCode();
    }
}
