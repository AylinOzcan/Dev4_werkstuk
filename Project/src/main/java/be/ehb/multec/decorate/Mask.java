package be.ehb.multec.decorate;

import be.ehb.multec.client.Client;

public abstract class Mask{
    protected String description;
    protected Client client;

    protected String getDescription(){
        return description;
    }
    protected Client getClient() {
        return client;
    }

    protected void setClient(Client client) {
        this.client = client;
    }
    protected void setDescription(String description){
        this.description = description;
    }

    protected abstract double cost();
}
