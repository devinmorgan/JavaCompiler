package compiler.ast.expr.method;

import compiler.ast.expr.method.AstMethodCallExpr;
import compiler.ast.lists.AstArgsList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstGlobalMethodCallExpr extends AstMethodCallExpr {
    final AstMethodCallExpr methodCall;
    public AstGlobalMethodCallExpr(AstMethodCallExpr methodCall) {
        super(methodCall.getLine(), methodCall.getCol(), methodCall.name, methodCall.args);
        this.methodCall = methodCall;
    }
}
