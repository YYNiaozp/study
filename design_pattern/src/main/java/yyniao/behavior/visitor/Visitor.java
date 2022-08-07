package yyniao.behavior.visitor;

/**
 * 抽象访问者，为该对象结构中具体元素声明一个访问接口
 */
public interface Visitor {
    void visit(Student student);
    void visit(Teacher teacher);

}
