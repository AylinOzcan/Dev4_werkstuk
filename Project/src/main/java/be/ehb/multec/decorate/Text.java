package be.ehb.multec.decorate;

public class Text extends MaskDecorator {
    private String text;

    public Text(Mask mask, String text) {
        super(mask);
        setText(text);
        super.setDescription(" text: " + text);
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    protected double cost() {
        return super.cost() + 1.00;
    }

    @Override
    protected String getDescription() {
        return super.mask.getDescription() + super.getDescription();
    }
}
