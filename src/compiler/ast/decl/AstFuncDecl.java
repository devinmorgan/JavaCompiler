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
}
