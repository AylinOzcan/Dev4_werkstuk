package be.ehb.multec.model;

public class Color extends Decorator {
    private String color = "standard";

    public Color(Mask mask, String color){
        super(mask);
        setColor( color );
        super.setDescription(", color: " + color);
    }

    @Override
    protected double cost() {
        return super.cost() + 0.25;
    }

    public String getDescription(){
        return super.mask.getDescription() + super.getDescription();
    }

    public void setColor(String color){
       this.color = color;
    }
}
