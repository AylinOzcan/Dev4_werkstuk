package be.ehb.multec.model;

public class Skins extends Decorator {
    private String skins = "basic skin";

    public Skins(Mask mask, String skins) {
        super(mask);
        setSkins(skins);
        super.setDescription(", skins: " + skins);
    }

    @Override
    protected  double cost(){
        return 1.70;
    };

    @Override
    protected String getDescription() {
        return super.mask.getDescription() + super.getDescription();
    }

    public void setSkins(String skins) {
        this.skins = skins;
    }

    @Override
    public void maskCosts() {
        //does nothing
    }
}
