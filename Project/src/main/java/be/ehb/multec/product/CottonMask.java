package be.ehb.multec.product;

import be.ehb.multec.decorate.Mask;

public final class CottonMask extends Mask {
    private static final CottonMask mask = new CottonMask();

    private CottonMask(){
        setDescription("Cotton mask");
    }

    public static CottonMask getInstance(){
        return mask;
    }

    @Override
    protected double cost() {
        return 1.25;
    }
}
