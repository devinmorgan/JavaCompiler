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
}
