package compiler.ast.stmt.ctrl_flow;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIfElseStmt extends AstIfStmt{
    final AstStmt elseCode;

    public AstIfElseStmt(int line, int col, AstExpr condition, AstStmt thenCode, AstStmt elseCode) {
        super(line, col, condition, thenCode);
        this.elseCode = elseCode;
    }
}
