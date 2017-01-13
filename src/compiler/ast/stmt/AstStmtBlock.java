package compiler.ast.stmt;

import compiler.ast.Ast;
import compiler.ast.decl.AstVarDecl;
import compiler.symbol_table.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstStmtBlock extends AstStmt {
    final ArrayList<Ast> blockContents;

    public AstStmtBlock(int line, int col, ArrayList<Ast> blockContents) {
        super(line, col);
        this.blockContents = blockContents;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        for (Ast ast : this.blockContents) {
            ast.performSemanticAnalysis(environment, errorMessage);
        }
    }
}
