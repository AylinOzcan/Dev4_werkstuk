package be.ehb.multec.model;

public abstract class Size extends Decorator{
    Product mask;
    protected Size(Mask mask) {
        super(mask);
    }


    @Override
    protected void getDescription(String description) {
        description ="size"; // description nog uitbreiden
        super.getDescription(description);
    }

    @Override
    protected  double cost(){
        return 1.90;
    };
}
