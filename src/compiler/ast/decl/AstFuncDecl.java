package compiler.ast.decl;

import compiler.ast.AstParam;
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
    final ArrayList<AstParam> params;
    final AstStmtBlock body;

    public AstFuncDecl(int line, int col,
                       AstType returnType,
                       String name,
                       ArrayList<AstParam> params,
                       AstStmtBlock body) {
        super(line, col);
        this.returnType = returnType;
        this.name = name;
        this.params = params;
        this.body = body;
    }
}
