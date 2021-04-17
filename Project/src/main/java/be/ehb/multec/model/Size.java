package be.ehb.multec.model;

public class Size extends Decorator{
    String size = "medium";
    protected Size(Mask mask, String size) {
        super(mask);
        setSize(size);
        super.setDescription(", size: " + size);
    }

    @Override
    protected  double cost(){
        return 1.90;
    };

    @Override
    protected String getDescription() {
        return super.mask.getDescription() + super.getDescription();
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void maskCosts() {
        //does nothing
    }
}
