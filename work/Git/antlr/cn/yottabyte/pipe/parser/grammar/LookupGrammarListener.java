// Generated from /Users/zhangpeng/Code/work/yotta_spl_2/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/LookupGrammar.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LookupGrammarParser}.
 */
public interface LookupGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(LookupGrammarParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(LookupGrammarParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#lookup_command}.
	 * @param ctx the parse tree
	 */
	void enterLookup_command(LookupGrammarParser.Lookup_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#lookup_command}.
	 * @param ctx the parse tree
	 */
	void exitLookup_command(LookupGrammarParser.Lookup_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#match_params}.
	 * @param ctx the parse tree
	 */
	void enterMatch_params(LookupGrammarParser.Match_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#match_params}.
	 * @param ctx the parse tree
	 */
	void exitMatch_params(LookupGrammarParser.Match_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#field_equal_list}.
	 * @param ctx the parse tree
	 */
	void enterField_equal_list(LookupGrammarParser.Field_equal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#field_equal_list}.
	 * @param ctx the parse tree
	 */
	void exitField_equal_list(LookupGrammarParser.Field_equal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#field_equal}.
	 * @param ctx the parse tree
	 */
	void enterField_equal(LookupGrammarParser.Field_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#field_equal}.
	 * @param ctx the parse tree
	 */
	void exitField_equal(LookupGrammarParser.Field_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#match_type_params}.
	 * @param ctx the parse tree
	 */
	void enterMatch_type_params(LookupGrammarParser.Match_type_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#match_type_params}.
	 * @param ctx the parse tree
	 */
	void exitMatch_type_params(LookupGrammarParser.Match_type_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#rename_field_list}.
	 * @param ctx the parse tree
	 */
	void enterRename_field_list(LookupGrammarParser.Rename_field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#rename_field_list}.
	 * @param ctx the parse tree
	 */
	void exitRename_field_list(LookupGrammarParser.Rename_field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#rename_field}.
	 * @param ctx the parse tree
	 */
	void enterRename_field(LookupGrammarParser.Rename_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#rename_field}.
	 * @param ctx the parse tree
	 */
	void exitRename_field(LookupGrammarParser.Rename_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#as_field_clause}.
	 * @param ctx the parse tree
	 */
	void enterAs_field_clause(LookupGrammarParser.As_field_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#as_field_clause}.
	 * @param ctx the parse tree
	 */
	void exitAs_field_clause(LookupGrammarParser.As_field_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#lookup_option}.
	 * @param ctx the parse tree
	 */
	void enterLookup_option(LookupGrammarParser.Lookup_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#lookup_option}.
	 * @param ctx the parse tree
	 */
	void exitLookup_option(LookupGrammarParser.Lookup_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(LookupGrammarParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(LookupGrammarParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(LookupGrammarParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(LookupGrammarParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(LookupGrammarParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(LookupGrammarParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(LookupGrammarParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(LookupGrammarParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(LookupGrammarParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(LookupGrammarParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LookupGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LookupGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LookupGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LookupGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(LookupGrammarParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(LookupGrammarParser.Field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookupGrammarParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(LookupGrammarParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookupGrammarParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(LookupGrammarParser.File_nameContext ctx);
}