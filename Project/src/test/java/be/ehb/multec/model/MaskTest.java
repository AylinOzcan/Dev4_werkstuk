package be.ehb.multec.model;

import org.junit.Test;

public class MaskTest {

    @Test
    public void createMask(){
        /*
        Mask mask = new SurgicalMask();
        mask = new Color(mask, "blue");
        mask = new Pattern(mask, "kaleodoscope" );
        mask = new Size(mask, "small");
        System.out.println(mask.getDescription() + " €" + mask.cost());
        */

        Mask mask = Product.getInstance();
        mask.setDescription("Cotton mask");
        mask = new Color(mask, "pink");
        mask = new Skins(mask, "personalised");
        mask = new Size(mask, "small");

        System.out.println(mask.getDescription() + " €" + mask.cost());

        Mask mask1 = Product.getInstance();
        mask1.setDescription("Surgical mask");
        mask1 = new Color(mask1, "pink");
        mask1 = new Skins(mask1, "personalised");
        mask1 = new Pattern(mask1, " ");
        mask1 = new Size(mask1, "small");
        System.out.println(mask1.getDescription() + " €" + mask1.cost());
    }
}