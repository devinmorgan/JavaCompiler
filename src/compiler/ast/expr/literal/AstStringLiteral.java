package compiler.ast.expr.literal;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstStringLiteral extends AstLiteral {
    final String value;

    public AstStringLiteral(int line, int col, String value) {
        super(line, col);
        this.value = value;
    }
}
