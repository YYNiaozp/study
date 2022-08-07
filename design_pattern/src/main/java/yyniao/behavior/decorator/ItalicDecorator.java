package yyniao.behavior.decorator;

public class ItalicDecorator extends NodeDecorator {
    protected ItalicDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<i>" + target.getText() + "</i>";
    }
}
