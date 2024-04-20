// Generated from /Users/zhangpeng/Code/work/yotta_spl/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/import/wc_strings.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wc_stringsParser}.
 */
public interface wc_stringsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#wildcard_strings}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_strings(wc_stringsParser.Wildcard_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#wildcard_strings}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_strings(wc_stringsParser.Wildcard_stringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(wc_stringsParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(wc_stringsParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(wc_stringsParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(wc_stringsParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(wc_stringsParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(wc_stringsParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(wc_stringsParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(wc_stringsParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(wc_stringsParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(wc_stringsParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(wc_stringsParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(wc_stringsParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(wc_stringsParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(wc_stringsParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(wc_stringsParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(wc_stringsParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link wc_stringsParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(wc_stringsParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link wc_stringsParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(wc_stringsParser.Field_listContext ctx);
}