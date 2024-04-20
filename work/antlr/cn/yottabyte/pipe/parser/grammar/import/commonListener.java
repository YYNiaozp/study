// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link commonParser}.
 */
public interface commonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link commonParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(commonParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(commonParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(commonParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(commonParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(commonParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(commonParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(commonParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(commonParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(commonParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(commonParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(commonParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(commonParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(commonParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(commonParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(commonParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(commonParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link commonParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(commonParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link commonParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(commonParser.Field_listContext ctx);
}