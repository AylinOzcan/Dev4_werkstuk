package be.ehb.multec.model;

public abstract class Mask {
    protected String description;
    /*
    protected Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
     */

    protected void setDescription(String description){
        this.description = description;
    }

    protected String getDescription(){
        return description;
    }

    protected abstract double cost();
}
