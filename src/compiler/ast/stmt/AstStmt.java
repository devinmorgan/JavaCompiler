package compiler.ast.stmt;

import compiler.ast.Ast;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstStmt extends Ast {
    public AstStmt(int line, int col) {
        super(line, col);
    }
}
