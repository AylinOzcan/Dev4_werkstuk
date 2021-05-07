package be.ehb.multec.model;

public class Skins extends Decorator {
    private String skins;

    public Skins(Mask mask, String skins) {
        super(mask);
        setSkins(skins);
        super.setDescription(", skins: " + skins);
    }

    @Override
    protected double cost() {
        return super.cost() + 1.00;
    }

    @Override
    protected String getDescription() {
        return super.mask.getDescription() + super.getDescription();
    }

    public void setSkins(String skins) {
        this.skins = skins;
    }
}
