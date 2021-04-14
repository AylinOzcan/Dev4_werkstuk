package be.ehb.multec.data;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void adapter() {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}