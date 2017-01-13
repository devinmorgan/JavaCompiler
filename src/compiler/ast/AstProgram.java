package compiler.ast;

import compiler.ast.decl.AstClassDecl;
import compiler.ast.decl.AstFuncDecl;
import compiler.ast.decl.AstInterfaceDecl;
import compiler.ast.decl.AstVarDecl;
import compiler.ast.lists.AstParamsList;
import compiler.ast.type.AstType;
import compiler.ast.type.AstVoidType;
import compiler.symbol_table.Function;
import compiler.symbol_table.SymbolTable;

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

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {

        /*------------------------Populate SymbolTable--------------------------*/

        // populate SymbolTable with global variables and report duplicates
        for (AstVarDecl varDecl : this.globalVars)
            environment.addNewGlobalVariable(varDecl, errorMessage);

        // populate SymbolTable with static functions and report duplicates
        for (AstFuncDecl funcDecl : this.staticFuncs)
            environment.addNewStaticFunction(funcDecl, errorMessage);

        // populate SymbolTable with classes and report related errors
        for (AstClassDecl classDecl : this.classes)
            environment.addNewClass(classDecl, errorMessage);

        // populate SymbolTable with interfaces and report related errors
        for (AstInterfaceDecl interfaceDecl : this.interfaces)
            environment.addNewInterface(interfaceDecl, errorMessage);

        /*---------------------------Semantic Checks-----------------------------*/

        environment.checkClassesForSemanticErrors(errorMessage);

        // perform semantic analysis on the global vars
        for (AstVarDecl varDecl : this.globalVars)
            varDecl.performSemanticAnalysis(environment, errorMessage);

        // perform semantic analysis on the global functions
        for (AstFuncDecl funcDecl : this.staticFuncs)
            funcDecl.performSemanticAnalysis(environment, errorMessage);

        // perform semantic analysis on the declared classes
        for (AstClassDecl classDecl : this.classes)
            classDecl.performSemanticAnalysis(environment, errorMessage);

        // perform semantic analysis on the declared interfaces
        for (AstInterfaceDecl interfaceDecl : this.interfaces)
            interfaceDecl.performSemanticAnalysis(environment, errorMessage);

        /*---------------------------AstProgram Checks-----------------------------*/

        // check that environment contains void main() {...}
        Function main = new Function("main", new AstParamsList(-1, -1));
        AstType mainMethodReturnType = environment.getReturnTypeOfStaticFunction(main);

        if (mainMethodReturnType == null
                || !mainMethodReturnType.equals(new AstVoidType(-1, -1))) {
            String error = "No void main() {...} found. Program must contain" +
                    "a main() method of type void with no parameters.\n";
            errorMessage.append(error);
        }
    }
}
