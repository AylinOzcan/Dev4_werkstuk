package be.ehb.multec.model;

public abstract class CottonMask extends Mask{


    @Override
    protected void getDescription(String description) {
        description = "cottonMask"; // description nog uitbreiden
        super.getDescription(description);
    }
    @Override
    protected double cost(){
        return 1.30;
    };
}
