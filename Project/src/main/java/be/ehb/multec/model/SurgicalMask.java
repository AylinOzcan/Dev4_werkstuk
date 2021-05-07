package be.ehb.multec.model;

public final class SurgicalMask extends Mask{
    private static final SurgicalMask mask = new SurgicalMask();

    private SurgicalMask(){
        setDescription("Surgical mask");
    }

    public static SurgicalMask getInstance(){
        return mask;
    }

    @Override
    protected double cost() {
        return 1.50;
    }
}
