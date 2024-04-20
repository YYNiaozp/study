// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link boolParser}.
 */
public interface boolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link boolParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(boolParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link boolParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(boolParser.Bool_literalContext ctx);
}