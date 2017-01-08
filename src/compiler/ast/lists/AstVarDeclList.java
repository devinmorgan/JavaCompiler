package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.type.AstNonVoidType;

import java.util.HashSet;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVarDeclList extends Ast{
    final AstNonVoidType declType;
    final HashSet<String> varNames;

    public  AstVarDeclList(int line, int col, AstNonVoidType declType, HashSet<String> varNames) {
        super(line, col);
        this.declType = declType;
        this.varNames = varNames;
    }

}
