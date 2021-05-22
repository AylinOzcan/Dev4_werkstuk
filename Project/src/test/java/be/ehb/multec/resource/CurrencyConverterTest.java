package be.ehb.multec.resource;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {
    @Test
    public void adapterWithInterface() {
        USMarket nAmerica = new USMarket();
        EUMarket convert = new CurrencyConverter( nAmerica );

        //convert.costInEuro(1);
        Assert.assertEquals(1.21, convert.costInEuro(1), 0.01);
    }

    @Test
    public void adapterWithoutInterface() {
        USMarket nAmerica = new USMarket();
        CurrencyConverter convert = new CurrencyConverter( nAmerica );

        //convert.costInEuro(2);
        Assert.assertEquals(2.42, convert.costInEuro(2), 0.01);
    }

    @Test
    public void adapterWithoutAdaptee() {
        EUMarket convert = new CurrencyConverter();

        //convert.costInEuro(1);
        Assert.assertEquals(1.21, convert.costInEuro(1), 0.01);
    }
}