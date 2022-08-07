package yyniao.behavior.visitor;

/**
 * 简介：
 * 访问者模式(Visitor Pattern)模式是行为型(Behavioral)设计模式，提供一个作用于某种对象结构上的各元素的操作方式，可以使我们在不改变元素结构的前
 * 提下，定义作用于元素的新操作。换言之，如果系统的数据结构是比较稳定的，但其操作（算法）是易于变化的，那么使用访问者模式是个不错的选择；如果数据结构
 * 是易于变化的，则不适合使用访问者模式。
 *
 * 访问者模式一共有五种角色：
 * (1) Vistor（抽象访问者）：为该对象结构中具体元素角色声明一个访问操作接口。
 * (2) ConcreteVisitor（具体访问者）：每个具体访问者都实现了Vistor中定义的操作。
 * (3) Element（抽象元素）：定义了一个accept操作，以Visitor作为参数。
 * (4) ConcreteElement（具体元素）：实现了Element中的accept()方法，调用Vistor的访问方法以便完成对一个元素的操作。
 * (5) ObjectStructure（对象结构）：可以是组合模式，也可以是集合；能够枚举它包含的元素；提供一个接口，允许Vistor访问它的元素。
 *
 * 总结：
 * 如果一个对象结构比较复杂，同时结构稳定不易变化，但却需要经常在此结构上定义新的操作，那就非常合适使用访问者模式，比如复杂的集合对象、XML文档解析、
 * 编译器的设计等。访问者模式使我们更加容易的增加访问操作，但增加元素比较困难，需要我们修改抽象访问类和所有的具体访问类。
 */
public class VisitorClient {

    /**
     * 如果教师发表论文数超过8篇或者学生论文超过2篇可以评选科研优秀奖，
     * 如果教师教学反馈分大于等于85分或者学生成绩大于等于90分可以评选成绩优秀奖。
     * @param args
     */
    public static void main(String[] args) {
        //初始化元素
        Element stu1 = new Student("Student Jim", 92, 3);
        Element stu2 = new Student("Student Ana", 89, 1);
        Element t1 = new Teacher("Teacher Mike", 83, 10);
        Element t2 = new Teacher("Teacher Lee", 88, 7);

        //初始化对象结构
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(stu1);
        objectStructure.addElement(stu2);
        objectStructure.addElement(t1);
        objectStructure.addElement(t2);

        //定义具体访问者，选拔优秀成绩者
        Visitor gradeSelection = new GradeSelection();
        //具体的访问操作，打印输出访问结果
        objectStructure.accept(gradeSelection);
        System.out.println("结构不变，操作易变---------");
        //数据结构是没有变化的，如果我们还想增加选拔科研优秀者的操作，如下
        Visitor researcherSelection = new ResearcherSelection();
        objectStructure.accept(researcherSelection);
    }
}
