package compiler.ast.expr.method;

import compiler.ast.lists.AstArgsList;
import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public abstract class AstMethodCallExpr extends AstExpr {
    final String name;
    final AstArgsList args;

    public AstMethodCallExpr(int line, int col, String name, AstArgsList args) {
        super(line, col);
        this.name = name;
        this.args = args;
    }
}
