package compiler.ast.type;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIntType extends AstNonVoidType {
    public AstIntType(int line, int col) {
        super(line, col);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstIntType;
    }

    @Override
    public int hashCode() {
        return 11;
    }
}
