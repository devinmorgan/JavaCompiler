package compiler.ast.decl;

import compiler.ast.AstMethodSig;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceDecl extends AstDecl {
    final String name;
    final HashSet<AstMethodSig> methodSigs;

    public AstInterfaceDecl(int line, int col,
                            String name,
                            HashSet<AstMethodSig> methodSigs) {
        super(line, col);
        this.name = name;
        this.methodSigs = methodSigs;
    }
}
