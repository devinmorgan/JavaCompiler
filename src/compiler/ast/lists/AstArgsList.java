package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstArg;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArgsList extends Ast{
    final ArrayList<AstArg> argsList;

    public AstArgsList(int line, int col, ArrayList<AstArg> argsList) {
        super(line, col);
        this.argsList = argsList;
    }
}
