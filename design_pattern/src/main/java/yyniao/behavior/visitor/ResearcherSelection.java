package yyniao.behavior.visitor;

/**
 * 具体访问者，实现了Vistor中定义的操作。
 * ResearcherSelection，选拔优秀科研者
 */
public class ResearcherSelection implements Visitor {

    private String awardWords = "[%s]的论文数是%d，荣获了科研优秀奖。";

    @Override
    public void visit(Student element) {
        // 如果学生发表论文数超过2，则入围科研优秀奖。
        if (element.getPaperCount() > 2) {
            System.out.println(String.format(awardWords,
                    element.getName(), element.getPaperCount()));
        }
    }

    @Override
    public void visit(Teacher element) {
        // 如果老师发表论文数超过8，则入围科研优秀奖。
        if (element.getPaperCount() > 8) {
            System.out.println(String.format(awardWords,
                    element.getName(), element.getPaperCount()));
        }
    }
}
