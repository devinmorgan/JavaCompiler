package compiler.ast.expr.method;

import compiler.ast.lists.AstArgsList;
import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public abstract class AstMethodCallExpr extends AstExpr {
    final String methodName;
    final AstArgsList methodArgs;
}
