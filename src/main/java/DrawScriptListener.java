// Generated from C:/Users/Utilizador/IdeaProjects/DrawScript/src\DrawScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawScriptParser}.
 */
public interface DrawScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DrawScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DrawScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(DrawScriptParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(DrawScriptParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(DrawScriptParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(DrawScriptParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#instructionList}.
	 * @param ctx the parse tree
	 */
	void enterInstructionList(DrawScriptParser.InstructionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#instructionList}.
	 * @param ctx the parse tree
	 */
	void exitInstructionList(DrawScriptParser.InstructionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(DrawScriptParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(DrawScriptParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(DrawScriptParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(DrawScriptParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(DrawScriptParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(DrawScriptParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(DrawScriptParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(DrawScriptParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DrawScriptParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DrawScriptParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DrawScriptParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DrawScriptParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(DrawScriptParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(DrawScriptParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#linevalue}.
	 * @param ctx the parse tree
	 */
	void enterLinevalue(DrawScriptParser.LinevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#linevalue}.
	 * @param ctx the parse tree
	 */
	void exitLinevalue(DrawScriptParser.LinevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DrawScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DrawScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DrawScriptParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DrawScriptParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DrawScriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DrawScriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(DrawScriptParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(DrawScriptParser.DelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(DrawScriptParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(DrawScriptParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#g}.
	 * @param ctx the parse tree
	 */
	void enterG(DrawScriptParser.GContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#g}.
	 * @param ctx the parse tree
	 */
	void exitG(DrawScriptParser.GContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(DrawScriptParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(DrawScriptParser.BContext ctx);
}