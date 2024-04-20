// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link wc_fieldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface wc_fieldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link wc_fieldParser#wildcard_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_identifier(wc_fieldParser.Wildcard_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_fieldParser#wildcard_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_field(wc_fieldParser.Wildcard_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_fieldParser#wildcard_fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_fieldlist(wc_fieldParser.Wildcard_fieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_fieldParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(wc_fieldParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_fieldParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(wc_fieldParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link wc_fieldParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(wc_fieldParser.Field_listContext ctx);
}