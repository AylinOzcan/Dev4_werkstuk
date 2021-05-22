package be.ehb.multec.decorate;

import be.ehb.multec.client.Client;
import be.ehb.multec.product.CottonMask;
import be.ehb.multec.product.SurgicalMask;
import be.ehb.multec.resource.CurrencyConverter;
import be.ehb.multec.resource.EUMarket;
import be.ehb.multec.resource.USMarket;
import org.junit.Assert;
import org.junit.Test;

public class MaskTest {

    @Test
    public void getDescription() {
        Mask mask = SurgicalMask.getInstance();
        mask = new Color(mask, "pink");
        mask = new Text(mask, "personalised");
        mask = new Pattern(mask, "stripes");
        mask = new Size(mask, "small");

        Assert.assertEquals("Surgical mask, color: pink, text: personalised, pattern: stripes, size: small", mask.getDescription());
        //System.out.println(mask.getDescription());
    }

    @Test
    public void getClient() {
        Mask mask = SurgicalMask.getInstance();
        mask = new Color(mask, "pink");
        mask = new Text(mask, "personalised");
        mask = new Pattern(mask, "stripes");
        mask = new Size(mask, "small");

        Client client = new Client(1,"name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        mask.setClient(client);

        Assert.assertEquals(client, mask.getClient());
        //System.out.println(mask.getClient());
    }

    @Test
    public void cost() {
        Mask mask = SurgicalMask.getInstance();
        mask = new Color(mask, "pink");
        mask = new Text(mask, "personalised");
        mask = new Pattern(mask, "stripes");
        mask = new Size(mask, "small");

        System.out.println(mask.getDescription() + " €" + mask.cost());
        Assert.assertEquals(4.0, mask.cost(), 0.01);
        //System.out.println(mask.cost());

        Mask mask1 = CottonMask.getInstance();
        mask1 = new Color(mask1, "pink");
        mask1 = new Text(mask1, "personalised");
        mask1 = new Size(mask1, "small");

        System.out.println(mask1.getDescription() + " €" + mask1.cost());
        Assert.assertEquals(3.0, mask1.cost(), 0.01);
        //System.out.println(mask1.cost());
    }

    @Test
    public void setCostInDollar(){
        USMarket nAmerica = new USMarket();
        EUMarket convert = new CurrencyConverter( nAmerica );

        Mask mask = SurgicalMask.getInstance();
        mask = new Color(mask, "pink");
        mask = new Text(mask, "personalised");
        mask = new Pattern(mask, "stripes");
        mask = new Size(mask, "small");

        //System.out.println(mask.cost());
        //convert.costInEuro(mask.cost());
        Assert.assertEquals(4.84 ,convert.costInEuro(mask.cost()), 0.01);
    }

}