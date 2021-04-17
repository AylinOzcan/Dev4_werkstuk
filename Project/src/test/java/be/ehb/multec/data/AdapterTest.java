package be.ehb.multec.data;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void adapterWithoutInterface() {
        USMarket adaptee = new USMarket();
        MonetaryAdapter adapter = new MonetaryAdapter( adaptee );
        adapter.maskCosts();
    }

    @Test
    public void adapterWithInterface() {
        USMarket adaptee = new USMarket();
        EUMarket adapter = new MonetaryAdapter( adaptee );
        adapter.maskCosts();
    }

    @Test
    public void adapterWithoutAdaptee() {
        EUMarket adapter = new MonetaryAdapter();
        adapter.maskCosts();
    }
}