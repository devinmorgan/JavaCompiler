package compiler.ast.type;

import compiler.ast.Ast;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class AstType extends Ast {
    public AstType(int line, int col) {
        super(line, col);
    }
}
