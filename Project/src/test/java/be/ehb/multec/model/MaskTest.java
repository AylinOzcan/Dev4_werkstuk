package be.ehb.multec.model;
import be.ehb.multec.data.*;

import org.junit.Test;

public class MaskTest {

    @Test
    public void createClient(){
        Client client = new Client("name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        System.out.println(client.getClientInfo());
        System.out.println(client.getFullName());
    }

    @Test
    public void createMask(){
        Mask mask = SurgicalMask.getInstance();
        mask = new Color(mask, "pink");
        mask = new Skins(mask, "personalised");
        mask = new Pattern(mask, "stripes");
        mask = new Size(mask, "small");
        System.out.println(mask.getDescription() + " €" + mask.cost());

        Mask mask1 = CottonMask.getInstance();
        mask1 = new Color(mask1, "pink");
        mask1 = new Skins(mask1, "personalised");
        mask1 = new Size(mask1, "small");
        System.out.println(mask1.getDescription() + " €" + mask1.cost());

        /*
        //Client
        Client client = new Client("name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        mask1.setClient(client);
        System.out.println(mask1.getClient().getClientInfo());

        //Personalised mask in dollar ? ( get the total cost of a mask in dollar ? )

         */
    }

}