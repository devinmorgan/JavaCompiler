package compiler.ast.expr.method;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstIntType;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstReadInt extends AstExpr {
    final AstType type = new AstIntType();
}
