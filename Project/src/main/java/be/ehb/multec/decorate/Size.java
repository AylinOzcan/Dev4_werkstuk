package be.ehb.multec.decorate;

public class Size extends MaskDecorator {
    private String size;

    public Size(Mask mask, String size) {
        super(mask);
        setSize(size);
        super.setDescription(", size: " + size);
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    protected double cost() {
        return super.cost() + 0.50;
    }

    @Override
    protected String getDescription() {
        return super.mask.getDescription() + super.getDescription();
    }
}
