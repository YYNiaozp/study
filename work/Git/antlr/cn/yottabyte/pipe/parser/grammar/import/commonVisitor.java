// Generated from /Users/zhangpeng/Code/work/yotta_spl_2/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/import/common.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link commonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface commonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link commonParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(commonParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(commonParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(commonParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(commonParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(commonParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#null_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_literal(commonParser.Null_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(commonParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(commonParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link commonParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(commonParser.Field_listContext ctx);
}