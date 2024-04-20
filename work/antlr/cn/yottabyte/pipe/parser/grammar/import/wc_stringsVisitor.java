// Generated from /Users/zhangpeng/Code/work/yotta_spl/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/import/wc_strings.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link wc_stringsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface wc_stringsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#wildcard_strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_strings(wc_stringsParser.Wildcard_stringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(wc_stringsParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(wc_stringsParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(wc_stringsParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(wc_stringsParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(wc_stringsParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#null_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_literal(wc_stringsParser.Null_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(wc_stringsParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(wc_stringsParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_stringsParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(wc_stringsParser.Field_listContext ctx);
}