package compiler.ast.expr.literal;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIntLiteral extends AstLiteral {
    final int value;

    public AstIntLiteral(int line, int col, int value) {
        super(line, col);
        this.value = value;
    }
}
