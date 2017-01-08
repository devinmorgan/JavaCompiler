package compiler.ast.expr.method;

import compiler.ast.expr.method.AstMethodCallExpr;
import compiler.ast.lists.AstArgsList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstGlobalMethodCallExpr extends AstMethodCallExpr {
    public AstGlobalMethodCallExpr(int line, int col, String name, AstArgsList args) {
        super(line, col, name, args);
    }
}
