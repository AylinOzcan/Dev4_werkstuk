package be.ehb.multec.model;

public class SurgicalMask extends Mask {

    public SurgicalMask(){
        setDescription("Surgical mask");
    }

    @Override
    protected double cost() {
        return 1.25;
    }
}
