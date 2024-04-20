// Generated from /Users/zhangpeng/Code/work/yotta_spl/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/expression.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressionParser}.
 */
public interface expressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(expressionParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(expressionParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_expr}
	 * labeled alternative in {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expr(expressionParser.Binary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_expr}
	 * labeled alternative in {@link expressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expr(expressionParser.Binary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary_expr}
	 * labeled alternative in {@link expressionParser#unary_expr_}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(expressionParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary_expr}
	 * labeled alternative in {@link expressionParser#unary_expr_}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(expressionParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefix_unary_expr}
	 * labeled alternative in {@link expressionParser#unary_expr_}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_unary_expr(expressionParser.Prefix_unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefix_unary_expr}
	 * labeled alternative in {@link expressionParser#unary_expr_}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_unary_expr(expressionParser.Prefix_unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code precedence_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_primary_expr(expressionParser.Precedence_primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code precedence_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_primary_expr(expressionParser.Precedence_primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_primary_expr(expressionParser.Literal_primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_primary_expr(expressionParser.Literal_primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void enterId_primary_expr(expressionParser.Id_primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void exitId_primary_expr(expressionParser.Id_primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void enterFunc_primary_expr(expressionParser.Func_primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_primary_expr}
	 * labeled alternative in {@link expressionParser#primary_expr_}.
	 * @param ctx the parse tree
	 */
	void exitFunc_primary_expr(expressionParser.Func_primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(expressionParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(expressionParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(expressionParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(expressionParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#case_func_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_func_expr(expressionParser.Case_func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#case_func_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_func_expr(expressionParser.Case_func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#case_func_expr_pair}.
	 * @param ctx the parse tree
	 */
	void enterCase_func_expr_pair(expressionParser.Case_func_expr_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#case_func_expr_pair}.
	 * @param ctx the parse tree
	 */
	void exitCase_func_expr_pair(expressionParser.Case_func_expr_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(expressionParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(expressionParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(expressionParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(expressionParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(expressionParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(expressionParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(expressionParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(expressionParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(expressionParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(expressionParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(expressionParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(expressionParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(expressionParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(expressionParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(expressionParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(expressionParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(expressionParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(expressionParser.Field_listContext ctx);
}