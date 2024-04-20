// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link file_nameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface file_nameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link file_nameParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(file_nameParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link file_nameParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(file_nameParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link file_nameParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(file_nameParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link file_nameParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(file_nameParser.Field_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link file_nameParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(file_nameParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link file_nameParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(file_nameParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link file_nameParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(file_nameParser.Number_listContext ctx);
}