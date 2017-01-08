package compiler.ast.expr.literal;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstBooleanLiteral extends AstLiteral{
    final boolean value;

    public AstBooleanLiteral(int line, int col, boolean value) {
        super(line, col);
        this.value = value;
    }
}
