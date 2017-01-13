package compiler.ast;

import compiler.ast.Ast;
import compiler.ast.lists.AstParamsList;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

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

    public String getName() {
        return this.name;
    }

    public AstParamsList getParams() {
        return this.params;
    }

    public AstType getReturnType() {
        return this.returnType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstMethodSig) {
            AstMethodSig that = (AstMethodSig) obj;

            return this.name.equals(that.name)
                    && this.params.equals(that.params);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.params.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // create a new local scope
        environment.pushNewScope();

        // check validity of returnType
        this.returnType.performSemanticAnalysis(environment, errorMessage);

        // check the validity or the parameters
        this.params.performSemanticAnalysis(environment, errorMessage);

        // remove the current local scope
        environment.popLocalScope();
    }
}
