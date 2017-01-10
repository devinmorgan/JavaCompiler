package compiler.ast.decl;

import compiler.ast.AstParam;
import compiler.ast.lists.AstParamsList;
import compiler.ast.stmt.AstStmtBlock;
import compiler.ast.type.AstType;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstFuncDecl) {
            AstFuncDecl that = (AstFuncDecl) obj;

            return this.returnType.equals(that.returnType)
                    && this.name.equals(that.name)
                    && this.params.equals(that.params);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.returnType.hashCode() * this.name.hashCode() * this.params.hashCode();
    }
}
