// Generated from /Users/zhangpeng/Code/work/yotta_spl_2/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/LookupGrammar.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LookupGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LookupGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(LookupGrammarParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#lookup_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_command(LookupGrammarParser.Lookup_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#match_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_params(LookupGrammarParser.Match_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#field_equal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_equal_list(LookupGrammarParser.Field_equal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#field_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_equal(LookupGrammarParser.Field_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#match_type_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_type_params(LookupGrammarParser.Match_type_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#rename_field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_field_list(LookupGrammarParser.Rename_field_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#rename_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_field(LookupGrammarParser.Rename_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#as_field_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_field_clause(LookupGrammarParser.As_field_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#lookup_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_option(LookupGrammarParser.Lookup_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(LookupGrammarParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(LookupGrammarParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(LookupGrammarParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(LookupGrammarParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#null_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_literal(LookupGrammarParser.Null_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LookupGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(LookupGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(LookupGrammarParser.Field_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LookupGrammarParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(LookupGrammarParser.File_nameContext ctx);
}