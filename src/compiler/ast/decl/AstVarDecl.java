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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstVarDecl) {
            AstVarDecl that = (AstVarDecl) obj;

            return this.name.equals(that.name)
                    && this.type.equals(that.type);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.type.hashCode();
    }
}
