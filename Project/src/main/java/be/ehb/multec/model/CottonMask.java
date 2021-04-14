package be.ehb.multec.model;

public class CottonMask extends Mask{
    public CottonMask(){
        setDescription("Cotton mask");
    }

    @Override
    protected double cost(){
        return 1.30;
    };
}
