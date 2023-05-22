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
	 * Visit a parse tree produced by {@link DrawScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DrawScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(DrawScriptParser.HeaderContext ctx);
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
}