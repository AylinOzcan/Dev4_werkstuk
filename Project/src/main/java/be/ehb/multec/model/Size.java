package be.ehb.multec.model;

public class Size extends Decorator{
    private String size = "standard";

    public Size(Mask mask, String size) {
        super(mask);
        setSize(size);
        super.setDescription(", size: " + size);
    }

    @Override
    protected double cost() {
        return super.cost() + 0.50;
    }

    @Override
    protected String getDescription() {
        return super.mask.getDescription() + super.getDescription();
    }

    public void setSize(String size) {
        this.size = size;
    }
}
