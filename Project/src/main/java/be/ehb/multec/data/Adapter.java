package be.ehb.multec.data;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter( Adaptee adaptee ) {
        this.adaptee = adaptee;
    }

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.doSomething(); //translate request - delegation
    }
}
