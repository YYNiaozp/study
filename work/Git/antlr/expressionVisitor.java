// Generated from /Users/zhangpeng/Code/work/yotta_spl/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/expression.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link expressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface expressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(expressionParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_expr}
	 * labeled alternative in {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expr(expressionParser.Binary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primary_expr}
	 * labeled alternative in {@link expressionParser#unary_expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expr(expressionParser.Primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefix_unary_expr}
	 * labeled alternative in {@link expressionParser#unary_expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_unary_expr(expressionParser.Prefix_unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code precedence_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_primary_expr(expressionParser.Precedence_primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_primary_expr(expressionParser.Literal_primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_primary_expr(expressionParser.Id_primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_primary_expr(expressionParser.Func_primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(expressionParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(expressionParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#case_func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_func_expr(expressionParser.Case_func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#case_func_expr_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_func_expr_pair(expressionParser.Case_func_expr_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(expressionParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(expressionParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(expressionParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(expressionParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(expressionParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#null_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_literal(expressionParser.Null_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(expressionParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(expressionParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link expressionParser#field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_list(expressionParser.Field_listContext ctx);
}