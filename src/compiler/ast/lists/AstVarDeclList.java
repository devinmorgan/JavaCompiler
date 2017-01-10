package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.decl.AstVarDecl;
import compiler.ast.type.AstNonVoidType;

import java.util.HashSet;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVarDeclList extends Ast{
    final HashSet<AstVarDecl> varDeclsList = new HashSet<>();

    public  AstVarDeclList(int line, int col) {
        super(line, col);
    }

    public void addVarDecl(AstVarDecl decl) {
        this.varDeclsList.add(decl);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstVarDeclList) {
            AstVarDeclList that = (AstVarDeclList) obj;

            return this.varDeclsList.equals(that.varDeclsList);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.varDeclsList.hashCode();
    }
}
