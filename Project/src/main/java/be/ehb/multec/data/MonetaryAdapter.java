package be.ehb.multec.data;

public class MonetaryAdapter implements EUMarket {
    private USMarket usMarket;

    public MonetaryAdapter( USMarket us ) {
        this.usMarket = us;
    }

    public MonetaryAdapter(){
        this.usMarket = new USMarket();
    }

    @Override
    public void maskCosts() {
        usMarket.maskInDollar();
    }
}
