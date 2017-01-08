package compiler.ast.type;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstNonVoidType extends AstType{
    public AstNonVoidType(int line, int col) {
        super(line, col);
    }
}
