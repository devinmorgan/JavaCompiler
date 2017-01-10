package compiler.ast.decl;

import compiler.ast.Ast;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstDecl extends Ast {
    public AstDecl(int line, int col) {
        super(line, col);
    }
}
