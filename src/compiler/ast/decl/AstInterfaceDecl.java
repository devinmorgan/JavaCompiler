package compiler.ast.decl;

import compiler.ast.AstMethodSig;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceDecl extends AstDecl {
    final String interfaceName;
    final ArrayList<AstMethodSig> interfaceMethods;
}
