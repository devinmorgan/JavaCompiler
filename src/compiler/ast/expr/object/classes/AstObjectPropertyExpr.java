package compiler.ast.expr.object.classes;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstObjectPropertyExpr extends AstExpr {
    final AstExpr object;
    final AstExpr property;

    public AstObjectPropertyExpr(int line, int col, AstExpr object, AstExpr property) {
        super(line, col);
        this.object = object;
        this.property = property;
    }
}
