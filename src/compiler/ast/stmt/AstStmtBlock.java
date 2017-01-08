package compiler.ast.stmt;

import compiler.ast.Ast;

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
}
