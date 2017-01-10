package compiler.ast;

import compiler.ast.Ast;
import compiler.ast.lists.AstParamsList;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstMethodSig extends Ast {
    final AstType returnType;
    final String name;
    final AstParamsList params;

    public AstMethodSig(AstType returnType, String name, AstParamsList params) {
        super(returnType.getLine(), returnType.getCol());
        this.returnType = returnType;
        this.name = name;
        this.params = params;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstMethodSig) {
            AstMethodSig that = (AstMethodSig) obj;

            return this.returnType.equals(that.returnType)
                    && this.name.equals(that.name)
                    && this.params.equals(that.params);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.returnType.hashCode() * this.name.hashCode();
    }
}
