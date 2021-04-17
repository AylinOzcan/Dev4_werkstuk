package be.ehb.multec.model;

import be.ehb.multec.data.EUMarket;

public abstract class Mask implements EUMarket {

    protected String description;

    protected void setDescription(String description){
        this.description = description;
    }

    protected String getDescription(){return description;}

    protected abstract double cost();
}
