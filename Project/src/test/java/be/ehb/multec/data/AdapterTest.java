package be.ehb.multec.data;

import data.Adaptee;
import data.Adapter;
import data.Target;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void adapter() {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}
