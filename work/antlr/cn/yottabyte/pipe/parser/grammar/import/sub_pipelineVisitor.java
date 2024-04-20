// Generated from /Users/zhangpeng/Code/work/yotta_spl/spl_parser/src/main/java/cn/yottabyte/pipe/parser/grammar/import/sub_pipeline.g4 by ANTLR 4.10.1
package cn.yottabyte.pipe.parser.grammar.import;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sub_pipelineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sub_pipelineVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sub_pipelineParser#sub_pipeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_pipeline(sub_pipelineParser.Sub_pipelineContext ctx);
}