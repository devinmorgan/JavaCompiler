package compiler.ast.decl;

import compiler.ast.AstMethodSig;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceDecl extends AstDecl {
    final String name;
    final ArrayList<AstMethodSig> methodSigs;

    public AstInterfaceDecl(int line, int col,
                            String name,
                            ArrayList<AstMethodSig> methodSigs) {
        super(line, col);
        this.name = name;
        this.methodSigs = methodSigs;
    }
}
