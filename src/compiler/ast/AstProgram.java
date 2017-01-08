package compiler.ast;

import compiler.ast.decl.AstClassDecl;
import compiler.ast.decl.AstFuncDecl;
import compiler.ast.decl.AstInterfaceDecl;
import compiler.ast.decl.AstVarDecl;

import java.util.HashSet;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstProgram extends Ast {

    final HashSet<AstVarDecl> globalVars;
    final HashSet<AstFuncDecl> staticFuncs;
    final HashSet<AstClassDecl> classes;
    final HashSet<AstInterfaceDecl> interfaces;

    public AstProgram(int line, int col,
                      HashSet<AstVarDecl> globalVars,
                      HashSet<AstFuncDecl> staticFuncs,
                      HashSet<AstClassDecl> classes, HashSet<AstInterfaceDecl> interfaces) {
        super(line, col);
        this.globalVars = globalVars;
        this.staticFuncs = staticFuncs;
        this.classes = classes;
        this.interfaces = interfaces;
    }
}
