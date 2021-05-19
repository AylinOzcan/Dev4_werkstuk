package be.ehb.multec.resource;

public class CurrencyConverter implements EUMarket{
    private USMarket usMarket;

    public CurrencyConverter(USMarket usMarket ) {
        this.usMarket = usMarket;
    }

    public CurrencyConverter(){
        this.usMarket = new USMarket();
    }

    @Override
    public void costInEuro(double costInEuro) {
        double costInDollar = costcalculater(costInEuro);
        usMarket.costInDollar(costInDollar);
    }

    public double costcalculater(double costInEuro) {
        double calculated = costInEuro * 1.21;
        return calculated;
    }
}