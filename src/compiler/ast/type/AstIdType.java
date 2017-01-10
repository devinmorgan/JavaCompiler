package compiler.ast.type;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIdType extends AstNonVoidType {
    final String typeName; // class name OR interface name

    public AstIdType(int line, int col, String typeName) {
        super(line, col);
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstIdType) {
            AstIdType that = (AstIdType) obj;

            return this.typeName.equals(that.typeName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.typeName.hashCode();
    }
}
