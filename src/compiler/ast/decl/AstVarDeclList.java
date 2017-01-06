package compiler.ast.decl;

import compiler.ast.Ast;
import compiler.ast.type.AstNonVoidType;

import java.util.HashSet;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVarDeclList extends Ast{
    final AstNonVoidType declType;
    final HashSet<String> varNames;

}
