package be.ehb.multec.decorate;

public class Color extends MaskDecorator {
    private String color;

    public Color(Mask mask, String color){
        super(mask);
        setColor( color );
        super.setDescription(", color: " + color);
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    protected double cost() {
        return super.cost() + 0.25;
    }

    @Override
    protected String getDescription(){
        return super.mask.getDescription() + super.getDescription();
    }

}
