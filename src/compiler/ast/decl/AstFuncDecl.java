package compiler.ast.decl;

import compiler.ast.AstParam;
import compiler.ast.stmt.AstStmtBlock;
import compiler.ast.type.AstType;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstFuncDecl extends AstDecl{
    final AstType returnType;
    final String functionName;
    final ArrayList<AstParam> paramsList;
    final AstStmtBlock functionBody;
}
