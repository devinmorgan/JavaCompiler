package compiler.ast.decl;

import compiler.ast.lists.AstInterfaceUseList;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstClassDecl extends AstDecl {
    final String className;
    String parentClass;
    AstInterfaceUseList implementedInterfaces;
    final ArrayList<AstDecl> declsList;

    public AstClassDecl(int line, int col,
                        String className,
                        String parentClass,
                        AstInterfaceUseList implementedInterfaces,
                        ArrayList<AstDecl> declsList) {
        super(line, col);
        this.className = className;
        this.parentClass = parentClass;
        this.implementedInterfaces = implementedInterfaces;
        this.declsList = declsList;
    }
}
