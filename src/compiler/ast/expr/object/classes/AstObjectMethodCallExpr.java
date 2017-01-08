package compiler.ast.expr.object.classes;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.method.AstMethodCallExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstObjectMethodCallExpr extends AstMethodCallExpr {
    final AstExpr object;
}
