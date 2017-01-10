package compiler.ast;

import compiler.ast.Ast;
import compiler.ast.type.AstNonVoidType;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParam extends Ast {
    final AstNonVoidType type;
    final String name;

    public AstParam(AstNonVoidType type, String name) {
        super(type.getLine(), type.getCol());
        this.type = type;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstParam) {
            AstParam that = (AstParam) obj;

            return this.name.equals(that.name) && this.type.equals(that.type);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.type.hashCode();
    }
}
