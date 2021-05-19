package be.ehb.multec.decorate;

import be.ehb.multec.client.Client;
import be.ehb.multec.product.CottonMask;
import be.ehb.multec.product.SurgicalMask;
import be.ehb.multec.resource.CurrencyConverter;
import be.ehb.multec.resource.EUMarket;
import be.ehb.multec.resource.USMarket;
import org.junit.Test;

public class MaskTest {

    @Test
    public void createMask(){
        Mask mask = SurgicalMask.getInstance();
        mask = new Color(mask, "pink");
        mask = new Text(mask, "personalised");
        mask = new Pattern(mask, "stripes");
        mask = new Size(mask, "small");
        System.out.println(mask.getDescription() + " €" + mask.cost());

        Mask mask1 = CottonMask.getInstance();
        mask1 = new Color(mask1, "pink");
        mask1 = new Text(mask1, "personalised");
        mask1 = new Size(mask1, "small");
        System.out.println(mask1.getDescription() + " €" + mask1.cost());

        //Client
        Client client = new Client(1,"name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        mask1.setClient(client);
        System.out.println(mask1.getClient().getClientInfo());
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
        System.out.println(mask.getDescription() + " €" + mask.cost());

        convert.costInEuro(mask.cost());
    }
}