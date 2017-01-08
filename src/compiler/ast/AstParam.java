package compiler.ast;

import compiler.ast.Ast;
import compiler.ast.type.AstNonVoidType;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParam extends Ast {
    final AstNonVoidType type;
    final String name;

    public AstParam(int line, int col, AstNonVoidType type, String name) {
        super(line, col);
        this.type = type;
        this.name = name;
    }
}
