package compiler.ast.expr.object.classes;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstObjectPropertyExpr extends AstExpr {
    final AstExpr object;
    final AstExpr property;
}
