// Generated from C:/Users/Utilizador/IdeaProjects/DrawScript/src\DrawScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DrawScriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(DrawScriptParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(DrawScriptParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#instructionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionList(DrawScriptParser.InstructionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(DrawScriptParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#background}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground(DrawScriptParser.BackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(DrawScriptParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(DrawScriptParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DrawScriptParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DrawScriptParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(DrawScriptParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#linevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinevalue(DrawScriptParser.LinevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DrawScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DrawScriptParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DrawScriptParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiter(DrawScriptParser.DelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(DrawScriptParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(DrawScriptParser.GContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(DrawScriptParser.BContext ctx);
}