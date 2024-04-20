// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wc_fieldParser}.
 */
public interface wc_fieldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#wildcard_identifier}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_identifier(wc_fieldParser.Wildcard_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#wildcard_identifier}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_identifier(wc_fieldParser.Wildcard_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#wildcard_field}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_field(wc_fieldParser.Wildcard_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#wildcard_field}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_field(wc_fieldParser.Wildcard_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#wildcard_fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_fieldlist(wc_fieldParser.Wildcard_fieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#wildcard_fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_fieldlist(wc_fieldParser.Wildcard_fieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#space_splitted_wildcard_fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterSpace_splitted_wildcard_fieldlist(wc_fieldParser.Space_splitted_wildcard_fieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#space_splitted_wildcard_fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitSpace_splitted_wildcard_fieldlist(wc_fieldParser.Space_splitted_wildcard_fieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(wc_fieldParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(wc_fieldParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(wc_fieldParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(wc_fieldParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_fieldParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(wc_fieldParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_fieldParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(wc_fieldParser.Field_listContext ctx);
}