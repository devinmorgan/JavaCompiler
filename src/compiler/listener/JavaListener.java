package compiler.listener;

import compiler.ast.Ast;
import compiler.ast.AstMethodSig;
import compiler.ast.AstParam;
import compiler.ast.AstProgram;
import compiler.ast.decl.AstClassDecl;
import compiler.ast.decl.AstFuncDecl;
import compiler.ast.decl.AstInterfaceDecl;
import compiler.ast.decl.AstVarDecl;
import compiler.ast.expr.object.array.AstArrayStruct;
import compiler.ast.expr.object.array.AstArrayUnit;
import compiler.ast.lists.AstParamsList;
import compiler.ast.type.*;
import compiler.grammar.JavaParser;
import compiler.grammar.JavaParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by devinmorgan on 1/8/17.
 */
// TODO: 1/8/17 make sure to implement the .hashCode() and .equals() for every AST class
public class JavaListener extends JavaParserBaseListener {
    final Stack<Ast> buildStack = new Stack<>();
    AstProgram astProgram;

    private class WrongStackElementException extends RuntimeException {
        public WrongStackElementException(String message) {
            super(message);
        }
    }
    
    @Override public void exitProgram(JavaParser.ProgramContext ctx) {
        HashSet<AstVarDecl> globarVars = new HashSet<>();
        HashSet<AstFuncDecl> staticFuncs = new HashSet<>();
        HashSet<AstClassDecl> classes = new HashSet<>();
        HashSet<AstInterfaceDecl> interfaces = new HashSet<>();

        // iterate through all of the objects left in the stack
        // and add them to the appropriate HashSet
        while (! this.buildStack.empty()) {
            Ast obj = this.buildStack.peek();

            if (obj instanceof AstVarDecl) {
                globarVars.add( (AstVarDecl) this.buildStack.pop());
            }
            else if (obj instanceof AstFuncDecl) {
                staticFuncs.add( (AstFuncDecl) this.buildStack.pop());
            }
            else if (obj instanceof AstClassDecl) {
                classes.add( (AstClassDecl) this.buildStack.pop());
            }
            else if (obj instanceof AstInterfaceDecl) {
                interfaces.add( (AstInterfaceDecl) this.buildStack.pop());
            }
            else {
                String message = "Expecting varDecl, FuncDecl, classDecl, " +
                                "or InterfaceDecl. Found: " + obj.getClass().toString();
                throw new WrongStackElementException(message);
            }
        }

        // initialize the AstProgram
        this.astProgram = new AstProgram(0, 0, globarVars, staticFuncs, classes, interfaces);
    }
    
    @Override public void enterDecl(JavaParser.DeclContext ctx) { }
    
    @Override public void exitDecl(JavaParser.DeclContext ctx) { }
    
    @Override public void enterVar_decl(JavaParser.Var_declContext ctx) { }
    
    @Override public void exitVar_decl(JavaParser.Var_declContext ctx) { }
    
    @Override public void exitArrayType(JavaParser.ArrayTypeContext ctx) {
        // we expect at least 1 array unit
        if (!(this.buildStack.peek() instanceof AstArrayUnit)) {
            String message = "Expected AstArrayUnit. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // Pop the array units of the stack to determine the arrays dimensions
        int dimensions = 0;
        while (this.buildStack.peek() instanceof AstArrayUnit) {
            this.buildStack.pop();
            dimensions++;
        }

        // we expect there to be a type
        if (!(this.buildStack.peek() instanceof AstNonVoidType)) {
            String message = "Expected AstNonVoidType. Founder: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // pop the array type off the stack to determine the array type
        AstNonVoidType arrayType = (AstNonVoidType) this.buildStack.pop();

        // construct AstArrayType and add it to the stack
        this.buildStack.push(new AstArrayType(arrayType, dimensions));
    }

    @Override public void exitIntType(JavaParser.IntTypeContext ctx) {
        int line = ctx.RES_INT().getSymbol().getLine();
        int col = ctx.RES_INT().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstIntType(line, col));
    }

    @Override public void exitBooleanType(JavaParser.BooleanTypeContext ctx) {
        int line = ctx.RES_BOOLEAN().getSymbol().getLine();
        int col = ctx.RES_BOOLEAN().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstBoolType(line, col));
    }

    @Override public void exitStringType(JavaParser.StringTypeContext ctx) {
        int line = ctx.RES_STRING().getSymbol().getLine();
        int col = ctx.RES_STRING().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstStringType(line, col));
    }

    @Override public void exitObjectType(JavaParser.ObjectTypeContext ctx) {
        int line = ctx.ID().getSymbol().getLine();
        int col = ctx.ID().getSymbol().getCharPositionInLine();
        String name = ctx.ID().getSymbol().getText();
        this.buildStack.push(new AstIdType(line, col, name));
    }
    
    @Override public void exitArray_unit(JavaParser.Array_unitContext ctx) {
        // array units indicate the number of dimensions in the AstArrayType
        int line = ctx.L_SQUARE().getSymbol().getLine();
        int col = ctx.L_SQUARE().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstArrayUnit(line, col));
    }
    
    @Override public void enterFunc_decl(JavaParser.Func_declContext ctx) { }
    
    @Override public void exitFunc_decl(JavaParser.Func_declContext ctx) { }

    @Override public void exitParams(JavaParser.ParamsContext ctx) {
        // TODO: 1/8/17 verify that ctx.ID() are printed in same order

        // create the params list
        AstParamsList paramsList = new AstParamsList(-1, -1);
        for (int i = 0; i < ctx.ID().size(); i++) {

            // we expect a Type for each ID (var name)
            if (!(this.buildStack.peek() instanceof AstNonVoidType)) {
                String message = "Expected AstNonVoidType. Found: "
                        + this.buildStack.peek().getClass().toString();
                throw new WrongStackElementException(message);
            }

            // get the parameter Type
            AstNonVoidType type = (AstNonVoidType) this.buildStack.pop();

            // get the parameter Name
            String name = ctx.ID().get(i).getText();

            // create new AstParam and add it to the stack
            paramsList.addParam(new AstParam(type, name));
        }

        // add params list to the stack
        this.buildStack.push(paramsList);
    }
    
    @Override public void enterClass_decl(JavaParser.Class_declContext ctx) { }
    
    @Override public void exitClass_decl(JavaParser.Class_declContext ctx) { }
    
    @Override public void enterParent_class(JavaParser.Parent_classContext ctx) { }
    
    @Override public void exitParent_class(JavaParser.Parent_classContext ctx) { }
    
    @Override public void enterInterface_use(JavaParser.Interface_useContext ctx) { }
    
    @Override public void exitInterface_use(JavaParser.Interface_useContext ctx) { }
    
    @Override public void enterInterface_decl(JavaParser.Interface_declContext ctx) { }
    
    @Override public void exitInterface_decl(JavaParser.Interface_declContext ctx) { }
    
    @Override public void enterMethod_sig(JavaParser.Method_sigContext ctx) { }
    
    @Override public void exitMethod_sig(JavaParser.Method_sigContext ctx) {
        // determine the return type
        AstType returnType;
        if (ctx.RES_VOID() != null) {
            int line = ctx.RES_VOID().getSymbol().getLine();
            int col = ctx.RES_VOID().getSymbol().getCharPositionInLine();
            returnType = new AstVoidType(line, col);
        }
        else if (this.buildStack.peek() instanceof AstNonVoidType) {
            returnType = (AstNonVoidType) this.buildStack.pop();
        }
        else {
            // TODO: 1/8/17 throw Execption: expected AstNonVoidType on stack
            String message = "Expected AstNonVoidType. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the method name
        String name = ctx.ID().getText();

        // get the method paras
        AstParamsList params = new AstParamsList(-1, -1);
        if (!(this.buildStack.peek() instanceof AstParamsList)) {
            params = (AstParamsList) this.buildStack.pop();
        }

        // create the method sig and add it to the stack
        this.buildStack.push(new AstMethodSig(returnType, name, params));
    }
    
    @Override public void enterStmt_block(JavaParser.Stmt_blockContext ctx) { }
    
    @Override public void exitStmt_block(JavaParser.Stmt_blockContext ctx) { }
    
    @Override public void enterExprStmt(JavaParser.ExprStmtContext ctx) { }
    
    @Override public void exitExprStmt(JavaParser.ExprStmtContext ctx) { }
    
    @Override public void enterIfElseStmt(JavaParser.IfElseStmtContext ctx) { }
    
    @Override public void exitIfElseStmt(JavaParser.IfElseStmtContext ctx) { }
    
    @Override public void enterIfStmt(JavaParser.IfStmtContext ctx) { }
    
    @Override public void exitIfStmt(JavaParser.IfStmtContext ctx) { }
    
    @Override public void enterWhileStmt(JavaParser.WhileStmtContext ctx) { }
    
    @Override public void exitWhileStmt(JavaParser.WhileStmtContext ctx) { }
    
    @Override public void enterForStmt(JavaParser.ForStmtContext ctx) { }
    
    @Override public void exitForStmt(JavaParser.ForStmtContext ctx) { }
    
    @Override public void enterBreakStmt(JavaParser.BreakStmtContext ctx) { }
    
    @Override public void exitBreakStmt(JavaParser.BreakStmtContext ctx) { }
    
    @Override public void enterContinueStmt(JavaParser.ContinueStmtContext ctx) { }
    
    @Override public void exitContinueStmt(JavaParser.ContinueStmtContext ctx) { }
    
    @Override public void enterNonVoidReturnStmt(JavaParser.NonVoidReturnStmtContext ctx) { }
    
    @Override public void exitNonVoidReturnStmt(JavaParser.NonVoidReturnStmtContext ctx) { }
    
    @Override public void enterVoidReturnStmt(JavaParser.VoidReturnStmtContext ctx) { }
    
    @Override public void exitVoidReturnStmt(JavaParser.VoidReturnStmtContext ctx) { }
    
    @Override public void enterPrintStmt(JavaParser.PrintStmtContext ctx) { }
    
    @Override public void exitPrintStmt(JavaParser.PrintStmtContext ctx) { }
    
    @Override public void enterCodeBlock(JavaParser.CodeBlockContext ctx) { }
    
    @Override public void exitCodeBlock(JavaParser.CodeBlockContext ctx) { }
    
    @Override public void enterElse_stmt(JavaParser.Else_stmtContext ctx) { }
    
    @Override public void exitElse_stmt(JavaParser.Else_stmtContext ctx) { }
    
    @Override public void enterBoolLiteralExpr(JavaParser.BoolLiteralExprContext ctx) { }
    
    @Override public void exitBoolLiteralExpr(JavaParser.BoolLiteralExprContext ctx) { }
    
    @Override public void enterAndExpr(JavaParser.AndExprContext ctx) { }
    
    @Override public void exitAndExpr(JavaParser.AndExprContext ctx) { }
    
    @Override public void enterObjectProperty(JavaParser.ObjectPropertyContext ctx) { }
    
    @Override public void exitObjectProperty(JavaParser.ObjectPropertyContext ctx) { }
    
    @Override public void enterReadLineExpr(JavaParser.ReadLineExprContext ctx) { }
    
    @Override public void exitReadLineExpr(JavaParser.ReadLineExprContext ctx) { }
    
    @Override public void enterVarAccessExpr(JavaParser.VarAccessExprContext ctx) { }
    
    @Override public void exitVarAccessExpr(JavaParser.VarAccessExprContext ctx) { }
    
    @Override public void enterParenthExpr(JavaParser.ParenthExprContext ctx) { }
    
    @Override public void exitParenthExpr(JavaParser.ParenthExprContext ctx) { }
    
    @Override public void enterNewObjExpr(JavaParser.NewObjExprContext ctx) { }
    
    @Override public void exitNewObjExpr(JavaParser.NewObjExprContext ctx) { }
    
    @Override public void enterArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx) { }
    
    @Override public void exitArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx) { }
    
    @Override public void enterStringLiteralExpr(JavaParser.StringLiteralExprContext ctx) { }
    
    @Override public void exitStringLiteralExpr(JavaParser.StringLiteralExprContext ctx) { }
    
    @Override public void enterRelationalExpr(JavaParser.RelationalExprContext ctx) { }
    
    @Override public void exitRelationalExpr(JavaParser.RelationalExprContext ctx) { }
    
    @Override public void enterOrExpr(JavaParser.OrExprContext ctx) { }
    
    @Override public void exitOrExpr(JavaParser.OrExprContext ctx) { }
    
    @Override public void enterNegateExpr(JavaParser.NegateExprContext ctx) { }
    
    @Override public void exitNegateExpr(JavaParser.NegateExprContext ctx) { }
    
    @Override public void enterAssignExpr(JavaParser.AssignExprContext ctx) { }
    
    @Override public void exitAssignExpr(JavaParser.AssignExprContext ctx) { }
    
    @Override public void enterReadIntExpr(JavaParser.ReadIntExprContext ctx) { }
    
    @Override public void exitReadIntExpr(JavaParser.ReadIntExprContext ctx) { }
    
    @Override public void enterNullLiteralExpr(JavaParser.NullLiteralExprContext ctx) { }
    
    @Override public void exitNullLiteralExpr(JavaParser.NullLiteralExprContext ctx) { }
    
    @Override public void enterMultiplicativeExpr(JavaParser.MultiplicativeExprContext ctx) { }
    
    @Override public void exitMultiplicativeExpr(JavaParser.MultiplicativeExprContext ctx) { }
    
    @Override public void enterObjectMethodCall(JavaParser.ObjectMethodCallContext ctx) { }
    
    @Override public void exitObjectMethodCall(JavaParser.ObjectMethodCallContext ctx) { }
    
    @Override public void enterIntLiteralExpr(JavaParser.IntLiteralExprContext ctx) { }
    
    @Override public void exitIntLiteralExpr(JavaParser.IntLiteralExprContext ctx) { }
    
    @Override public void enterEqualityExpr(JavaParser.EqualityExprContext ctx) { }
    
    @Override public void exitEqualityExpr(JavaParser.EqualityExprContext ctx) { }
    
    @Override public void enterAdditiveExpr(JavaParser.AdditiveExprContext ctx) { }
    
    @Override public void exitAdditiveExpr(JavaParser.AdditiveExprContext ctx) { }
    
    @Override public void enterNewArrayExpr(JavaParser.NewArrayExprContext ctx) { }
    
    @Override public void exitNewArrayExpr(JavaParser.NewArrayExprContext ctx) { }
    
    @Override public void enterGlobalMethodCall(JavaParser.GlobalMethodCallContext ctx) { }
    
    @Override public void exitGlobalMethodCall(JavaParser.GlobalMethodCallContext ctx) { }
    
    @Override public void enterNotExpr(JavaParser.NotExprContext ctx) { }
    
    @Override public void exitNotExpr(JavaParser.NotExprContext ctx) { }
    
    @Override public void enterThisExpr(JavaParser.ThisExprContext ctx) { }
    
    @Override public void exitThisExpr(JavaParser.ThisExprContext ctx) { }
    
    @Override public void enterMethod_call(JavaParser.Method_callContext ctx) { }
    
    @Override public void exitMethod_call(JavaParser.Method_callContext ctx) { }
    
    @Override public void enterArray_struct(JavaParser.Array_structContext ctx) { }
    
    @Override public void exitArray_struct(JavaParser.Array_structContext ctx) { }
    
    @Override public void enterArgs(JavaParser.ArgsContext ctx) { }
    
    @Override public void exitArgs(JavaParser.ArgsContext ctx) { }

    
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    
    @Override public void visitTerminal(TerminalNode node) { }
    
    @Override public void visitErrorNode(ErrorNode node) { }
}
