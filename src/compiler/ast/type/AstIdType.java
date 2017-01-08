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
}
