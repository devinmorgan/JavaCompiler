package compiler.ast.expr.object.classes;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstNewObjectExpr extends AstExpr {
    final String className;

    public AstNewObjectExpr(int line, int col, String className) {
        super(line, col);
        this.className = className;
    }
}
