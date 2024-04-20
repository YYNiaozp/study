// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fieldParser}.
 */
public interface fieldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fieldParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(fieldParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fieldParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(fieldParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fieldParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(fieldParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link fieldParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(fieldParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link fieldParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(fieldParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fieldParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(fieldParser.Field_listContext ctx);
}