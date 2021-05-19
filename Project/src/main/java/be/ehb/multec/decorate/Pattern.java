package be.ehb.multec.decorate;

public class Pattern extends MaskDecorator {
    private String pattern;

    public Pattern(Mask mask, String pattern) {
        super(mask);
        setPattern(pattern);
        super.setDescription(", pattern: " + pattern);
    }

    public void setPattern(String pattern){
        this.pattern = pattern;
    }

    @Override
    protected double cost() {
        return super.cost() + 0.75;
    }

    @Override
    protected String getDescription(){
        return super.mask.getDescription() + super.getDescription();
    }
}
