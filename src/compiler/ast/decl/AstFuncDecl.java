package compiler.ast.decl;

import compiler.ast.AstParam;
import compiler.ast.lists.AstParamsList;
import compiler.ast.stmt.AstStmtBlock;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;
import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstFuncDecl extends AstDecl{
    final AstType returnType;
    final String name;
    final AstParamsList params;
    final AstStmtBlock body;

    public AstFuncDecl(AstType returnType,
                       String name,
                       AstParamsList params,
                       AstStmtBlock body) {
        super(returnType.getLine(), returnType.getCol());
        this.returnType = returnType;
        this.name = name;
        this.params = params;
        this.body = body;
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

    /**
        2 funcDecls are definited as equal if they have
     the same name and they have the same parameter types
     in the same order
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstFuncDecl) {
            AstFuncDecl that = (AstFuncDecl) obj;

            return this.name.equals(that.name)
                    && this.params.equals(that.params);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return  this.name.hashCode() * this.params.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // create a new local scope
        environment.pushNewFunctionScope(this.returnType);

        // valid ate the return type
        this.returnType.performSemanticAnalysis(environment, errorMessage);

        // validate the functions params
        this.params.performSemanticAnalysis(environment, errorMessage);

        // validate the function body
        this.body.performSemanticAnalysis(environment, errorMessage);

        // remove the current local scope
        environment.popLocalScope();
    }
}
