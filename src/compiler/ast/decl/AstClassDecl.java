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
}
