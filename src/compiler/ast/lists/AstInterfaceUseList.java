package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstInterfaceUse;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceUseList extends Ast {
    final ArrayList<AstInterfaceUse> interfacesList = new ArrayList<>();

    public AstInterfaceUseList(int line, int col) {
        super(line, col);
    }

    public void addInterfaceUse(AstInterfaceUse use) {
        this.interfacesList.add(use);
    }
}
