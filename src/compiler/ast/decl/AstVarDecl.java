package compiler.ast.decl;

import compiler.ast.Ast;
import compiler.ast.type.AstNonVoidType;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVarDecl extends AstDecl {
    final String name;
    final AstNonVoidType type;

    public AstVarDecl(int line, int col, String name, AstNonVoidType type) {
        super(line, col);
        this.name = name;
        this.type = type;
    }
}
