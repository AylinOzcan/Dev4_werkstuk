package be.ehb.multec.model;

public class Pattern extends Decorator {
    private String pattern;

    public Pattern(Mask mask, String pattern) {
        super(mask);
        setPattern(pattern);
        super.setDescription(", pattern: " + pattern);
    }

    @Override
    protected double cost() {
        return super.cost() + 0.75;
    }

    public String getDescription(){
        return super.mask.getDescription() + super.getDescription();
    }

    public void setPattern(String pattern){
        this.pattern = pattern;
    }
}
