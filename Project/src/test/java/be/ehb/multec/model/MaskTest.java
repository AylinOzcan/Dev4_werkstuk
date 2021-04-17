package be.ehb.multec.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaskTest {

    @Test
    public void createMask(){
        Mask mask = new SurgicalMask();
        mask = new Color(mask, "blue");
        mask = new Pattern(mask, "kaleodoscope" );
        mask = new Size(mask, "small");
        System.out.println(mask.getDescription() + " €" + mask.cost());
    }
}