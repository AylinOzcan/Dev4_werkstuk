package be.ehb.multec.client;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void getId() {
        Client client = new Client(1, "name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");

        Assert.assertEquals(1, client.getId());
        //System.out.println(client.getId());
    }

    @Test
    public void setId() {
        Client client = new Client("name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        client.setId(2);
        Assert.assertEquals(2, client.getId());
    }

    @Test
    public void getFullName() {
        Client client = new Client("name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");

        Assert.assertEquals("Client: name lastname", client.getFullName());
        //System.out.println(client.getFullName());
    }

    @Test
    public void getClientInfo() {
        Client client = new Client(1, "name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");

        Assert.assertEquals("Client: name lastname, Brabantstraat 224, 1030 Schaarbeek, +32 483 09 91 01", client.getClientInfo());
        //System.out.println(client.getClientInfo());
    }

    @Test
    public void testToString() {
        Client client = new Client(1, "name", "lastname", "Brabantstraat 224, 1030 Schaarbeek", "+32 483 09 91 01");
        Assert.assertEquals("Client{id=1, name='name', lastname='lastname', address='Brabantstraat 224, 1030 Schaarbeek', number='+32 483 09 91 01'}", client.toString());
    }
}