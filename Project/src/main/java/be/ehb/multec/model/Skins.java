package be.ehb.multec.model;

public abstract class Skins extends Decorator {
    Product mask;

    protected Skins(Mask mask) {
        super(mask);
    }



    @Override
    protected void getDescription(String description) {
        description = "skin"; //description nog uitbreiden
        super.getDescription(description);
    }
    @Override
    protected  double cost(){
        return 1.70;
    };
}
