// Generated from java-escape by ANTLR 4.11.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link file_nameParser}.
 */
public interface file_nameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link file_nameParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(file_nameParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(file_nameParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link file_nameParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(file_nameParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(file_nameParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link file_nameParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(file_nameParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(file_nameParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link file_nameParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(file_nameParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(file_nameParser.Field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link file_nameParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(file_nameParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(file_nameParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link file_nameParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(file_nameParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(file_nameParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link file_nameParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(file_nameParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link file_nameParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(file_nameParser.Number_listContext ctx);
}