package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstArg;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArgsList extends Ast{
    final ArrayList<AstArg> argsList = new ArrayList<>();

    public AstArgsList(int line, int col) {
        super(line, col);
    }

    public void addArg(AstArg arg) {
        this.argsList.add(arg);
    }
}
