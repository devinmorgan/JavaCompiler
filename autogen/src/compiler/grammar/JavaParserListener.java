// Generated from src/compiler/grammar/JavaParser.g4 by ANTLR 4.5.3

    package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(JavaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(JavaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(JavaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(JavaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(JavaParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(JavaParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(JavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(JavaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(JavaParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(JavaParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parent_class}.
	 * @param ctx the parse tree
	 */
	void enterParent_class(JavaParser.Parent_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parent_class}.
	 * @param ctx the parse tree
	 */
	void exitParent_class(JavaParser.Parent_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void enterInterfaces(JavaParser.InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void exitInterfaces(JavaParser.InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void enterInterface_decl(JavaParser.Interface_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void exitInterface_decl(JavaParser.Interface_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#method_sig}.
	 * @param ctx the parse tree
	 */
	void enterMethod_sig(JavaParser.Method_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#method_sig}.
	 * @param ctx the parse tree
	 */
	void exitMethod_sig(JavaParser.Method_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(JavaParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(JavaParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(JavaParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(JavaParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(JavaParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(JavaParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JavaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JavaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JavaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JavaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(JavaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(JavaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(JavaParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(JavaParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(JavaParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(JavaParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonVoidReturnStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturnStmt(JavaParser.NonVoidReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonVoidReturnStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturnStmt(JavaParser.NonVoidReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidReturnStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturnStmt(JavaParser.VoidReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidReturnStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturnStmt(JavaParser.VoidReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(JavaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(JavaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeBlock}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(JavaParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeBlock}
	 * labeled alternative in {@link JavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(JavaParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(JavaParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(JavaParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteralExpr(JavaParser.BoolLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteralExpr(JavaParser.BoolLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JavaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JavaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectProperty}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(JavaParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectProperty}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(JavaParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadLineExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadLineExpr(JavaParser.ReadLineExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadLineExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadLineExpr(JavaParser.ReadLineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAccessExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarAccessExpr(JavaParser.VarAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAccessExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarAccessExpr(JavaParser.VarAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthExpr(JavaParser.ParenthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthExpr(JavaParser.ParenthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewObjExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewObjExpr(JavaParser.NewObjExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewObjExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewObjExpr(JavaParser.NewObjExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(JavaParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(JavaParser.StringLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(JavaParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(JavaParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JavaParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JavaParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpr(JavaParser.NegateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpr(JavaParser.NegateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(JavaParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(JavaParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadIntExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadIntExpr(JavaParser.ReadIntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadIntExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadIntExpr(JavaParser.ReadIntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralExpr(JavaParser.NullLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralExpr(JavaParser.NullLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(JavaParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(JavaParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectMethodCall}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectMethodCall(JavaParser.ObjectMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectMethodCall}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectMethodCall(JavaParser.ObjectMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteralExpr(JavaParser.IntLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteralExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteralExpr(JavaParser.IntLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(JavaParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(JavaParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(JavaParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(JavaParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewArrayExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayExpr(JavaParser.NewArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewArrayExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayExpr(JavaParser.NewArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalMethodCall}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGlobalMethodCall(JavaParser.GlobalMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalMethodCall}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGlobalMethodCall(JavaParser.GlobalMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(JavaParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(JavaParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(JavaParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link JavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(JavaParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(JavaParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(JavaParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#array_struct}.
	 * @param ctx the parse tree
	 */
	void enterArray_struct(JavaParser.Array_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#array_struct}.
	 * @param ctx the parse tree
	 */
	void exitArray_struct(JavaParser.Array_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JavaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JavaParser.ArgsContext ctx);
}