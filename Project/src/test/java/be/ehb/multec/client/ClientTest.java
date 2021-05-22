package be.ehb.multec.client;

import org.junit.Test;

public class ClientTest {

    @Test
    public void createClient(){
        Client client = new Client(1, "name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        System.out.println(client.getClientInfo());
        System.out.println(client.getFullName());
    }
}