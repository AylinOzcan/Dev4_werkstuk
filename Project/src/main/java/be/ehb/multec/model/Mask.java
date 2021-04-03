package be.ehb.multec.model;

public abstract class Mask {

    protected String description;

    protected void getDescription(String description){
        this.description = description;
    }

    protected String getDescription(){return description;}

    protected abstract double cost();
}
