package compiler.ast.expr.object.classes;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.method.AstMethodCallExpr;
import compiler.ast.lists.AstArgsList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstObjectMethodCallExpr extends AstMethodCallExpr {
    final AstExpr object;
    public AstObjectMethodCallExpr(AstMethodCallExpr method, AstExpr object) {
        super(method.getLine(), method.getCol(), method.name, method.args);
        this.object = object;
    }
}
