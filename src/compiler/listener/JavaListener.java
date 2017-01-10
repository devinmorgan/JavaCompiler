package compiler.listener;

import compiler.ast.*;
import compiler.ast.decl.*;
import compiler.ast.expr.AstAssignExpr;
import compiler.ast.expr.AstExpr;
import compiler.ast.expr.AstParentheticalExpr;
import compiler.ast.expr.AstVarLocationExpr;
import compiler.ast.expr.binary.arith.AstAdditiveExpr;
import compiler.ast.expr.binary.arith.AstMultiplicativeExpr;
import compiler.ast.expr.binary.bool.AstAndExpr;
import compiler.ast.expr.binary.bool.AstEqualityExpr;
import compiler.ast.expr.binary.bool.AstOrExpr;
import compiler.ast.expr.binary.bool.AstRelationalExpr;
import compiler.ast.expr.literal.AstBooleanLiteral;
import compiler.ast.expr.literal.AstIntLiteral;
import compiler.ast.expr.literal.AstNullLiteral;
import compiler.ast.expr.literal.AstStringLiteral;
import compiler.ast.expr.method.AstGlobalMethodCallExpr;
import compiler.ast.expr.method.AstMethodCallExpr;
import compiler.ast.expr.method.AstReadInt;
import compiler.ast.expr.method.AstReadLineExpr;
import compiler.ast.expr.object.array.AstArrayAccessExpr;
import compiler.ast.expr.object.array.AstArrayStruct;
import compiler.ast.expr.object.array.AstArrayUnit;
import compiler.ast.expr.object.array.AstNewArrayExpr;
import compiler.ast.expr.object.classes.AstNewObjectExpr;
import compiler.ast.expr.object.classes.AstObjectMethodCallExpr;
import compiler.ast.expr.object.classes.AstObjectPropertyExpr;
import compiler.ast.expr.object.classes.AstThisExpr;
import compiler.ast.expr.unary.arith.AstNegExpr;
import compiler.ast.expr.unary.bool.AstNotExpr;
import compiler.ast.lists.AstArgsList;
import compiler.ast.lists.AstInterfaceUseList;
import compiler.ast.lists.AstParamsList;
import compiler.ast.lists.AstVarDeclList;
import compiler.ast.stmt.AstExprStmt;
import compiler.ast.stmt.AstPrintStmt;
import compiler.ast.stmt.AstStmt;
import compiler.ast.stmt.AstStmtBlock;
import compiler.ast.stmt.ctrl_flow.AstIfElseStmt;
import compiler.ast.stmt.ctrl_flow.AstIfStmt;
import compiler.ast.stmt.ctrl_flow.AstNonVoidReturnStmt;
import compiler.ast.stmt.ctrl_flow.AstVoidReturnStmt;
import compiler.ast.stmt.ctrl_flow.loops.AstBreakStmt;
import compiler.ast.stmt.ctrl_flow.loops.AstContinueStmt;
import compiler.ast.stmt.ctrl_flow.loops.AstForLoop;
import compiler.ast.stmt.ctrl_flow.loops.AstWhileLoop;
import compiler.ast.type.*;
import compiler.grammar.JavaParser;
import compiler.grammar.JavaParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * Created by devinmorgan on 1/8/17.
 */
// TODO: 1/8/17 make sure to implement the .hashCode() and .equals() for every AST class
// TODO: 1/8/17 A lot of these methods didn't pop items from the stack in the right order (remember its FILO)
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
    
    @Override public void exitVar_decl(JavaParser.Var_declContext ctx) {
        // we expect an AstNonVoidType for all the varDecls
        if (!(this.buildStack.peek() instanceof AstNonVoidType)) {
            String message = "Expected AstNonVoidType. Found: "
                    + this.buildStack.peek().getClass().toString();
        }

        // get the type from the stack
        AstNonVoidType type = (AstNonVoidType) this.buildStack.peek();

        // collect names of all the vars declared under this type
        AstVarDeclList list = new AstVarDeclList(-1, -1);
        for (int i = 0; i < ctx.ID().size(); i++) {
            int line = ctx.ID(i).getSymbol().getLine();
            int col = ctx.ID(i).getSymbol().getCharPositionInLine();
            String name = ctx.ID(i).getSymbol().getText();
            list.addVarDecl(new AstVarDecl(line, col, name, type));
        }

        // push the list to the stack
        this.buildStack.push(list);
    }
    
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

        // collect the tyep of the array
        AstNonVoidType type;
        if (ctx.RES_INT() != null) {
            int line = ctx.RES_INT().getSymbol().getLine();
            int col = ctx.RES_INT().getSymbol().getCharPositionInLine();
            type = new AstIntType(line, col);
        }
        else if (ctx.RES_BOOLEAN() != null) {
            int line = ctx.RES_BOOLEAN().getSymbol().getLine();
            int col = ctx.RES_BOOLEAN().getSymbol().getCharPositionInLine();
            type = new AstBoolType(line, col);
        }
        else if (ctx.RES_STRING() != null) {
            int line = ctx.RES_STRING().getSymbol().getLine();
            int col = ctx.RES_STRING().getSymbol().getCharPositionInLine();
            type = new AstStringType(line, col);
        }
        else if (ctx.ID() != null) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine();
            type = new AstStringType(line, col);
        }
        else {
            String message = "Missing or Illegal array type";
            throw new WrongStackElementException(message);
        }

        // construct AstArrayType and add it to the stack
        this.buildStack.push(new AstArrayType(type, dimensions));
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
    
    @Override public void exitFunc_decl(JavaParser.Func_declContext ctx) {
        // we expect AstStmtBlock on the stack
        if (!(this.buildStack.peek() instanceof AstStmtBlock)) {
            String message = "Expected AstStmtBlock. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the code block from the stack
        AstStmtBlock block = (AstStmtBlock) this.buildStack.pop();

        // function params are in the AstParamsList which may
        // or may not exist since some functions down't have params
        AstParamsList params = new AstParamsList(-1, -1); // in case it doesn't exist
        if (!(this.buildStack.peek() instanceof AstParamsList)) {
            params = (AstParamsList) this.buildStack.pop();
        }

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
            String message = "Expected AstNonVoidType. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the method name
        String name = ctx.ID().getText();

        // create the method sig and add it to the stack
        this.buildStack.push(new AstFuncDecl(returnType, name, params, block));
    }

    @Override public void exitParams(JavaParser.ParamsContext ctx) {
        // create the params list by popping items in reverse order
        // since are using a stack
        AstParamsList paramsList = new AstParamsList(-1, -1);
        for (int i = ctx.ID().size() - 1; i >= 0; i--) {

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
    
    @Override public void exitClass_decl(JavaParser.Class_declContext ctx) {

        // get the funcDecls and the varDecls from the class (if they exist)
        HashSet<AstDecl> classContents = new HashSet<>();
        while (this.buildStack.peek() instanceof AstFuncDecl
                || this.buildStack.peek() instanceof AstVarDecl) {
            classContents.add((AstDecl) this.buildStack.pop());
        }

        // grab the list of interfaces used (if they exist)
        AstInterfaceUseList implementedInterfaces = new AstInterfaceUseList(-1, -1);
        if (this.buildStack.peek() instanceof AstInterfaceUseList) {
            implementedInterfaces = (AstInterfaceUseList) this.buildStack.pop();
        }

        // grab parent class (if it exists)
        String parentClassName = "NO_PARENT_CLASS";
        if (this.buildStack.peek() instanceof AstParentClass) {
            parentClassName = ((AstParentClass) this.buildStack.pop()).getName();
        }

        // get the class name
        String className = ctx.ID().getSymbol().getText();

        // create the AstClassDecl and add it to the stack
        int line = ctx.RES_CLASS().getSymbol().getLine();
        int col = ctx.RES_CLASS().getSymbol().getCharPositionInLine();
        this.buildStack.push(
                new AstClassDecl(line, col, className, parentClassName,
                        implementedInterfaces, classContents)
        );
    }
    
    @Override public void exitParent_class(JavaParser.Parent_classContext ctx) {
        int line = ctx.ID().getSymbol().getLine();
        int col = ctx.ID().getSymbol().getCharPositionInLine();
        String name = ctx.ID().getSymbol().getText();
        this.buildStack.push(new AstParentClass(line, col, name));
    }
    
    @Override public void exitInterface_use(JavaParser.Interface_useContext ctx) {
        // add each interface use to the list
        AstInterfaceUseList list = new AstInterfaceUseList(-1, -1);
        for (int i = 0; i < ctx.ID().size(); i++) {
            int line = ctx.ID().get(i).getSymbol().getLine();
            int col = ctx.ID().get(i).getSymbol().getCharPositionInLine();
            String name = ctx.ID().get(i).getSymbol().getText();
            list.addInterfaceUse(new AstInterfaceUse(line, col, name));
        }

        // push the interface use list to the stack
        this.buildStack.push(list);
    }
    
    @Override public void exitInterface_decl(JavaParser.Interface_declContext ctx) {

        // collect all of the methodSigs that are part of this interface
        HashSet<AstMethodSig> interfaceMethods = new HashSet<>();
        while (this.buildStack.peek() instanceof AstMethodSig) {
            interfaceMethods.add((AstMethodSig) this.buildStack.pop());
        }

        // get the interface's name
        String name = ctx.ID().getSymbol().getText();

        // create the interfaceDecl and add it to the stack
        int line = ctx.RES_INTERFACE().getSymbol().getLine();
        int col = ctx.RES_INTERFACE().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstInterfaceDecl(line, col, name, interfaceMethods));
    }
    
    @Override public void exitMethod_sig(JavaParser.Method_sigContext ctx) {
        // method params are in the AstParamsList which may
        // or may not exist since some methods down't have params
        AstParamsList params = new AstParamsList(-1, -1); // in case it doesn't exist
        if (!(this.buildStack.peek() instanceof AstParamsList)) {
            params = (AstParamsList) this.buildStack.pop();
        }

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
            String message = "Expected AstNonVoidType. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the method name
        String name = ctx.ID().getText();

        // create the method sig and add it to the stack
        this.buildStack.push(new AstMethodSig(returnType, name, params));
    }
    
    @Override public void exitStmt_block(JavaParser.Stmt_blockContext ctx) {
        // collect the var_decls and func_decls from the class_decl
        ArrayList<Ast> blockContents = new ArrayList<>();
        while (this.buildStack.peek() instanceof AstVarDecl
                || this.buildStack.peek() instanceof AstStmt) {
            blockContents.add(this.buildStack.pop());
        }

        // we need to account for the stack popping the
        // items in reverse order
        Collections.reverse(blockContents);

        // create the Stmt block and add it to the stack
        this.buildStack.push(new AstStmtBlock(-1, -1, blockContents));
    }
    
    @Override public void exitExprStmt(JavaParser.ExprStmtContext ctx) {
        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // grab the ast expr off the stack
        AstExpr expr = (AstExpr) this.buildStack.pop();

        // create the stmtExpr and push it the stack
        this.buildStack.push(new AstExprStmt(expr));
    }

    @Override public void exitIfElseStmt(JavaParser.IfElseStmtContext ctx) {
        // we expect an AstStmt on the stack (else-code)
        if (!(this.buildStack.pop() instanceof AstStmt)) {
            String message = "Expected AstStmt. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the else-code form the stack
        AstStmt elseBlock = (AstStmt) this.buildStack.pop();

        // we expect an AstStmt on the stack (then-code)
        if (!(this.buildStack.pop() instanceof AstStmt)) {
            String message = "Expected AstStmt. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the then-code from the stack
        AstStmt thenBlock = (AstStmt) this.buildStack.pop();

        // we expect an AstExpr on the stack for the condition
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the condition expr from the stack
        AstExpr condition = (AstExpr) this.buildStack.pop();

        // create the if stmt and push it to the stack
        int line = ctx.RES_IF().getSymbol().getLine();
        int col = ctx.RES_IF().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstIfElseStmt(line, col, condition, thenBlock, elseBlock));
    }
    
    @Override public void exitIfStmt(JavaParser.IfStmtContext ctx) {
        // we expect an AstStmt on the stack (then-code)
        if (!(this.buildStack.pop() instanceof AstStmt)) {
            String message = "Expected AstStmt. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the then-code from the block
        AstStmt thenBlock = (AstStmt) this.buildStack.pop();

        // we expect an AstExpr on the stack for the condition
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the condition expr from the stack
        AstExpr condition = (AstExpr) this.buildStack.pop();

        // create the if stmt and push it to the stack
        int line = ctx.RES_IF().getSymbol().getLine();
        int col = ctx.RES_IF().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstIfStmt(line, col, condition, thenBlock));
    }
    
    @Override public void exitWhileStmt(JavaParser.WhileStmtContext ctx) {
        // we expect an AstStmt on the stack (then-code)
        if (!(this.buildStack.pop() instanceof AstStmt)) {
            String message = "Expected AstStmt. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the then-code from the block
        AstStmt whileBody = (AstStmt) this.buildStack.pop();

        // we expect an AstExpr on the stack for the condition
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the condition expr from the stack
        AstExpr condition = (AstExpr) this.buildStack.pop();

        // create the if stmt and push it to the stack
        int line = ctx.RES_WHILE().getSymbol().getLine();
        int col = ctx.RES_WHILE().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstWhileLoop(line, col, condition, whileBody));
    }
    
    @Override public void exitForStmt(JavaParser.ForStmtContext ctx) {
        // we expect an AstStmt on the stack (the loop body)
        if (!(this.buildStack.peek() instanceof AstStmt)) {
            String message = "Expected AstStmt. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the for loop body
        AstStmt forBody = (AstStmt) this.buildStack.pop();

        // check if an increment expression was included
        AstExpr incExpr = null;
        if (!ctx.inc_expr.isEmpty()) {

            // we expect an AstExpr on the stack
            if (!(this.buildStack.peek() instanceof AstExpr)) {
                String message = "Expected AstExpr. Found: "
                        + this.buildStack.peek().getClass().toString();
                throw new WrongStackElementException(message);
            }

            // get the incExpr from the stack
            incExpr = (AstExpr) this.buildStack.pop();
        }

        // we expect an AstExpr on the stack (the condition expr)
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the for condition from the stack
        AstExpr condition = (AstExpr) this.buildStack.pop();

        // check if a start expression was included
        AstExpr startExpr = null;
        if (!ctx.start_expr.isEmpty()) {

            // we expect an AstExpr on the stack
            if (!(this.buildStack.peek() instanceof AstExpr)) {
                String message = "Expected AstExpr. Found: "
                        + this.buildStack.peek().getClass().toString();
                throw new WrongStackElementException(message);
            }

            // get the incExpr from the stack
            startExpr = (AstExpr) this.buildStack.pop();
        }

        // create the AstForLoop and add it to the stack
        int line = ctx.RES_FOR().getSymbol().getLine();
        int col = ctx.RES_FOR().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstForLoop(line, col, condition, startExpr, incExpr, forBody));
    }
    
    @Override public void exitBreakStmt(JavaParser.BreakStmtContext ctx) {
        int line = ctx.RES_BREAK().getSymbol().getLine();
        int col = ctx.RES_BREAK().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstBreakStmt(line, col));
    }
    
    @Override public void exitContinueStmt(JavaParser.ContinueStmtContext ctx) {
        int line = ctx.RES_CONTINUE().getSymbol().getLine();
        int col = ctx.RES_CONTINUE().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstContinueStmt(line, col));
    }
    
    @Override public void exitNonVoidReturnStmt(JavaParser.NonVoidReturnStmtContext ctx) {
        // we expect an AstExpr on the stack (the return value)
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the returnExpr from the stack
        AstExpr expr = (AstExpr) this.buildStack.pop();

        // create the return stmt and push it the stack
        this.buildStack.push(new AstNonVoidReturnStmt(expr));
    }

    @Override public void exitVoidReturnStmt(JavaParser.VoidReturnStmtContext ctx) {
        int line = ctx.RES_RETURN().getSymbol().getLine();
        int col = ctx.RES_RETURN().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstVoidReturnStmt(line, col));
    }

    @Override public void exitPrintStmt(JavaParser.PrintStmtContext ctx) {
        // we expect an AstExpr on the stack (the expr to be printed)
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // grab the expr off the stack
        AstExpr expr = (AstExpr) this.buildStack.pop();

        // create the print stmt and push it the stack
        int line = ctx.RES_PRINT().getSymbol().getLine();
        int col = ctx.RES_PRINT().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstPrintStmt(line, col, expr));
    }
    
    @Override public void exitBoolLiteralExpr(JavaParser.BoolLiteralExprContext ctx) {
        int line = ctx.BOOL().getSymbol().getLine();
        int col = ctx.BOOL().getSymbol().getCharPositionInLine();
        boolean value = Boolean.valueOf(ctx.BOOL().getSymbol().getText());
        this.buildStack.push(new AstBooleanLiteral(line, col, value));
    }
    
    @Override public void exitAndExpr(JavaParser.AndExprContext ctx) {
        // we expected an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the rhs expr from stack
        AstExpr rhs = (AstExpr) this.buildStack.pop();

        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the lhs expr from stack
        AstExpr lhs = (AstExpr) this.buildStack.pop();

        // determine the operator
        String operator = "&&";

        // create the relExpr and add it to the stack
        this.buildStack.push(new AstAndExpr(lhs, operator, rhs));
    }
    
    @Override public void exitObjectProperty(JavaParser.ObjectPropertyContext ctx) {
        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // grab the property expr off the stack
        AstExpr property = (AstExpr) this.buildStack.pop();

        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // grab the object off the stack
        AstExpr object = (AstExpr) this.buildStack.pop();

        // create the AstObjectProperty and add it to the stack
        this.buildStack.push(new AstObjectPropertyExpr(object, property));
    }
    
    @Override public void exitReadLineExpr(JavaParser.ReadLineExprContext ctx) {
        int line = ctx.RES_READ_LINE().getSymbol().getLine();
        int col = ctx.RES_READ_LINE().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstReadLineExpr(line, col));
    }
    
    @Override public void exitVarAccessExpr(JavaParser.VarAccessExprContext ctx) {
        int line = ctx.ID().getSymbol().getLine();
        int col = ctx.ID().getSymbol().getCharPositionInLine();
        String name = ctx.ID().getSymbol().getText();
        this.buildStack.push(new AstVarLocationExpr(line, col, name));
    }

    @Override public void exitParenthExpr(JavaParser.ParenthExprContext ctx) {
        // we expect an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // grab the expr from the stack
        AstExpr expr = (AstExpr) this.buildStack.pop();

        // create the parenthetical expr and push it the stack
        int line = ctx.L_PAREN().getSymbol().getLine();
        int col = ctx.L_PAREN().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstParentheticalExpr(line, col, expr));
    }
    
    @Override public void exitNewObjExpr(JavaParser.NewObjExprContext ctx) {
        int line = ctx.RES_NEW().getSymbol().getLine();
        int col = ctx.RES_NEW().getSymbol().getCharPositionInLine();
        String className = ctx.ID().getSymbol().getText();
        this.buildStack.push(new AstNewObjectExpr(line ,col, className));
    }
    
    @Override public void exitArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx) {
        // we expect at least 1 AstArrayStruct on the stack
        if (!(this.buildStack.peek() instanceof AstArrayStruct)) {
            String message = "Expected AstArrayStruct. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the offset args from the stack
        ArrayList<AstArrayStruct> offsetsList = new ArrayList<>();
        while (this.buildStack.peek() instanceof AstArrayStruct) {
            offsetsList.add((AstArrayStruct) this.buildStack.pop());
        }

        // reverse the arrayList to undo the affect of popping the
        // objects from the stack in reverse order
        Collections.reverse(offsetsList>);

        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // pop the expr off the stack
        AstExpr arrayObject = (AstExpr) this.buildStack.pop();

        // create the arrayAccessExpr and add it to the stack
        this.buildStack.push(new AstArrayAccessExpr(arrayObject, offsetsList));
    }
    
    @Override public void exitStringLiteralExpr(JavaParser.StringLiteralExprContext ctx) {
        int line = ctx.STRING().getSymbol().getLine();
        int col = ctx.STRING().getSymbol().getCharPositionInLine();
        String value = ctx.STRING().getSymbol().getText();
        this.buildStack.push(new AstStringLiteral(line, col, value));
    }
    
    @Override public void exitRelationalExpr(JavaParser.RelationalExprContext ctx) {
        // we expected an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the rhs expr from stack
        AstExpr rhs = (AstExpr) this.buildStack.pop();

        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the lhs expr from stack
        AstExpr lhs = (AstExpr) this.buildStack.pop();

        // determine the operator
        String operator = "";
        if (ctx.LT_OP() != null) {
            operator = "<";
        }
        else if (ctx.GT_OP() != null) {
            operator = ">";
        }
        else if (ctx.LEQ_OP() != null) {
            operator = "<=";
        }
        else if (ctx.GEQ_OP() != null) {
            operator = ">=";
        }

        // create the relExpr and add it to the stack
        this.buildStack.push(new AstRelationalExpr(lhs, operator, rhs));
    }
    
    @Override public void exitOrExpr(JavaParser.OrExprContext ctx) {
        // we expected an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the rhs expr from stack
        AstExpr rhs = (AstExpr) this.buildStack.pop();

        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the lhs expr from stack
        AstExpr lhs = (AstExpr) this.buildStack.pop();

        // determine the operator
        String operator = "||";

        // create the relExpr and add it to the stack
        this.buildStack.push(new AstOrExpr(lhs, operator, rhs));
    }
    
    @Override public void exitNegateExpr(JavaParser.NegateExprContext ctx) {
        // get the AstExpr that is the stmt
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }
        AstExpr expr = (AstExpr) this.buildStack.pop();

        // create the negateExpr and push it the stack
        int line = ctx.SUB_OP().getSymbol().getLine();
        int col = ctx.SUB_OP().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstNegExpr(line, col, expr));
    }
    
    @Override public void exitAssignExpr(JavaParser.AssignExprContext ctx) {
        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the expr value from stack
        AstExpr value = (AstExpr) this.buildStack.pop();

        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the storeLocation from stack
        AstExpr storeLoc = (AstExpr) this.buildStack.pop();

        // create the AstAssignExpr and add it ot the stack
        this.buildStack.push(new AstAssignExpr(storeLoc, value));
    }
    
    @Override public void exitReadIntExpr(JavaParser.ReadIntExprContext ctx) {
        int line = ctx.RES_READ_INT().getSymbol().getLine();
        int col = ctx.RES_READ_INT().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstReadInt(line, col));
    }
    
    @Override public void exitNullLiteralExpr(JavaParser.NullLiteralExprContext ctx) {
        int line = ctx.RES_NULL().getSymbol().getLine();
        int col = ctx.RES_NULL().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstNullLiteral(line, col));
    }
    
    @Override public void exitMultiplicativeExpr(JavaParser.MultiplicativeExprContext ctx) {
        // we expected an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the rhs expr from stack
        AstExpr rhs = (AstExpr) this.buildStack.pop();

        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the lhs expr from stack
        AstExpr lhs = (AstExpr) this.buildStack.pop();

        // determine the operator
        String operator = "";
        if (ctx.MUL_OP() != null) {
            operator = "*";
        }
        else if (ctx.DIV_OP() != null) {
            operator = "/";
        }
        else if (ctx.MOD_OP() != null) {
            operator = "%";
        }

        // create the multExpr and add it to the stack
        this.buildStack.push(new AstMultiplicativeExpr(lhs, operator, rhs));
    }
    
    @Override public void exitObjectMethodCall(JavaParser.ObjectMethodCallContext ctx) {
        // we expect an AstMethodCallExpr on the stack
        if (!(this.buildStack.peek() instanceof AstMethodCallExpr)) {
            String message = "Expected AstMethodCallExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the method call from the stack
        AstMethodCallExpr method = (AstMethodCallExpr) this.buildStack.pop();

        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the method call from the stack
        AstExpr object = (AstExpr) this.buildStack.pop();

        // create the objectMethodCall and add it to the stack
        this.buildStack.push(new AstObjectMethodCallExpr(method, object));
    }
    
    @Override public void exitIntLiteralExpr(JavaParser.IntLiteralExprContext ctx) {
        int line = ctx.INT().getSymbol().getLine();
        int col = ctx.INT().getSymbol().getCharPositionInLine();
        int value = Integer.valueOf(ctx.INT().getSymbol().getText());
        this.buildStack.push(new AstIntLiteral(line, col, value));
    }
    
    @Override public void exitEqualityExpr(JavaParser.EqualityExprContext ctx) {
        // we expected an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the rhs expr from stack
        AstExpr rhs = (AstExpr) this.buildStack.pop();

        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the lhs expr from stack
        AstExpr lhs = (AstExpr) this.buildStack.pop();

        // determine the operator
        String operator = "";
        if (ctx.EQ_OP() != null) {
            operator = "==";
        }
        else if (ctx.NEQ_OP() != null) {
            operator = "!=";
        }

        // create the relExpr and add it to the stack
        this.buildStack.push(new AstEqualityExpr(lhs, operator, rhs));
    }
    
    @Override public void exitAdditiveExpr(JavaParser.AdditiveExprContext ctx) {
        // we expected an AstExpr to be on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the rhs expr from stack
        AstExpr rhs = (AstExpr) this.buildStack.pop();

        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the lhs expr from stack
        AstExpr lhs = (AstExpr) this.buildStack.pop();

        // determine the operator
        String operator = "";
        if (ctx.ADD_OP() != null) {
            operator = "+";
        }
        else if (ctx.SUB_OP() != null) {
            operator = "-";
        }

        // create the addExpr and add it to the stack
        this.buildStack.push(new AstAdditiveExpr(lhs, operator, rhs));
    }
    
    @Override public void exitNewArrayExpr(JavaParser.NewArrayExprContext ctx) {
        // we expect at least 1 AstArrayStruct on the stack
        if (!(this.buildStack.peek() instanceof AstArrayStruct)) {
            String message = "Expected AstArrayStruct. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the offset args from the stack
        ArrayList<AstArrayStruct> dimensionSizes = new ArrayList<>();
        while (this.buildStack.peek() instanceof AstArrayStruct) {
            dimensionSizes.add((AstArrayStruct) this.buildStack.pop());
        }

        // to undo the affects of popping the arrayStructs in reverse
        // order, we need to reverse the arrayList
        Collections.reverse(dimensionSizes);

        // determine the array type
        AstNonVoidType arrayType;
        if (ctx.RES_INT() != null) {
            int line = ctx.RES_INT().getSymbol().getLine();
            int col = ctx.RES_INT().getSymbol().getCharPositionInLine();
            arrayType = new AstIntType(line, col);
        }
        else if (ctx.RES_BOOLEAN() != null) {
            int line = ctx.RES_BOOLEAN().getSymbol().getLine();
            int col = ctx.RES_BOOLEAN().getSymbol().getCharPositionInLine();
            arrayType = new AstBoolType(line, col);
        }
        else if (ctx.RES_STRING() != null) {
            int line = ctx.RES_STRING().getSymbol().getLine();
            int col = ctx.RES_STRING().getSymbol().getCharPositionInLine();
            arrayType = new AstStringType(line, col);
        }
        else if (ctx.ID() != null) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine();
            String name = ctx.ID().getSymbol().getText();
            arrayType = new AstIdType(line, col, name);
        }
        else {
            String message = "Invalid or Missing array type";
            throw new WrongStackElementException(message);
        }

        // create the newArrayExpr and add it to the stack
        this.buildStack.push(new AstNewArrayExpr(arrayType, dimensionSizes));
    }
    
    @Override public void exitGlobalMethodCall(JavaParser.GlobalMethodCallContext ctx) {
        // we expect an AstMethodCallExpr on the stack
        if (!(this.buildStack.peek() instanceof AstMethodCallExpr)) {
            String message = "Expected AstMethodCallExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the AstMethodCallExpr from the stack
        AstMethodCallExpr methodCall = (AstMethodCallExpr) this.buildStack.pop();

        // create the global methodCallExpr and add it to the stack
        this.buildStack.push(new AstGlobalMethodCallExpr(methodCall));
    }
    
    @Override public void exitNotExpr(JavaParser.NotExprContext ctx) {
        // we expect an AstExpr on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // grab the AstExpr from the stack
        AstExpr expr = (AstExpr) this.buildStack.pop();

        // create the notExpr and push it the stack
        int line = ctx.NOT_OP().getSymbol().getLine();
        int col = ctx.NOT_OP().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstNotExpr(line, col, expr));
    }
    
    @Override public void exitThisExpr(JavaParser.ThisExprContext ctx) {
        int line = ctx.RES_THIS().getSymbol().getLine();
        int col = ctx.RES_THIS().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstThisExpr(line, col));
    }
    
    @Override public void exitMethod_call(JavaParser.Method_callContext ctx) {
        // we expect an AstArgsList on the stack
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstArgsList. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // get the AstArgsList from the stack
        AstArgsList argsList = (AstArgsList) this.buildStack.pop();

        // get the method name
        String methodName = ctx.ID().getSymbol().getText();

        // create the method call and add it to the stack
        int line = ctx.ID().getSymbol().getLine();
        int col = ctx.ID().getSymbol().getCharPositionInLine();
        this.buildStack.push(new AstMethodCallExpr(line, col, methodName, argsList));
    }
    
    @Override public void exitArray_struct(JavaParser.Array_structContext ctx) {
        // get the AstExpr that is the stmt
        if (!(this.buildStack.peek() instanceof AstExpr)) {
            String message = "Expected AstExpr. Found: "
                    + this.buildStack.peek().getClass().toString();
            throw new WrongStackElementException(message);
        }

        // push the arrayStruct to the stack
        this.buildStack.push(new AstArrayStruct((AstExpr) this.buildStack.pop()));
    }
    
    @Override public void exitArgs(JavaParser.ArgsContext ctx) {
        // grab args from the stack and construct the args list
        AstArgsList list = new AstArgsList(-1, -1);
        for (int i = ctx.COMMA().size(); i >= 0; i--) {

            // we expect an AstExpr on the stack (the arg value)
            if (!(this.buildStack.peek() instanceof AstExpr)) {
                String message = "Expected AstExpr. Found: "
                        + this.buildStack.peek().getClass().toString();
                throw new WrongStackElementException(message);
            }

            // pop the arg value from the stack
            list.addArg(new AstArg((AstExpr) this.buildStack.pop()));
        }

        // we need to reverse the list to undo the affects
        // of popping the args from the stack in reverse order
        Collections.reverse(list.argsList);

        // add args list to stack
        this.buildStack.push(list);
    }


    @Override public void visitErrorNode(ErrorNode node) {
        System.out.println(node.getText());
    }
}
