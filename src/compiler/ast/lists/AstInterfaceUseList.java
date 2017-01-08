package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstInterfaceUse;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceUseList extends Ast {
    final ArrayList<AstInterfaceUse> interfacesList;

    public AstInterfaceUseList(int line, int col, ArrayList<AstInterfaceUse> interfacesList) {
        super(line, col);
        this.interfacesList = interfacesList;
    }
}
