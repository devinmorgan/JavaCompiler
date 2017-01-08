package compiler.ast.expr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParentheticalExpr extends AstExpr {
    final AstExpr value;

    public AstParentheticalExpr(int line, int col, AstExpr value) {
        super(line, col);
        this.value = value;
    }
}
