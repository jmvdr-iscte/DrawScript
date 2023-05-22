// Generated from C:/Users/Utilizador/IdeaProjects/DrawScript/src\DrawScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawScriptParser}.
 */
public interface DrawScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DrawScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DrawScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(DrawScriptParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(DrawScriptParser.HeaderContext ctx);
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
}