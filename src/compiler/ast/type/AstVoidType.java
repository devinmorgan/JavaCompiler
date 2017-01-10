package compiler.ast.type;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVoidType extends AstType{
    public AstVoidType(int line, int col) {
        super(line, col);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AstVoidType;
    }

    @Override
    public int hashCode() {
        return 19;
    }
}
