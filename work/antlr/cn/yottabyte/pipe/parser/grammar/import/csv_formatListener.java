// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csv_formatParser}.
 */
public interface csv_formatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csv_formatParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(csv_formatParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link csv_formatParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(csv_formatParser.FormatContext ctx);
}