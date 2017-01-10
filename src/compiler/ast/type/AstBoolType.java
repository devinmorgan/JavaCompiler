package compiler.ast.type;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstBoolType extends AstNonVoidType {
    public AstBoolType(int line, int col) {
        super(line, col);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstBoolType;
    }

    @Override
    public int hashCode() {
        return 13;
    }
}
