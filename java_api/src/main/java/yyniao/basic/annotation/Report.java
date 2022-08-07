package yyniao.basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/5/14 23:04
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Repeatable(Reports.class)
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}

@Target(ElementType.METHOD)
@interface Reports {
    Report[] value();
}
