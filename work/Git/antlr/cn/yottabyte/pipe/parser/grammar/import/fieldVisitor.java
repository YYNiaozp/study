// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fieldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fieldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fieldParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(fieldParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fieldParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(fieldParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link fieldParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(fieldParser.Field_listContext ctx);
}