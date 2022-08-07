package yyniao.behavior.decorator;

public class UnderlineDecorator extends NodeDecorator{
    protected UnderlineDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<u>" + target.getText() + "</u>";
    }
}
