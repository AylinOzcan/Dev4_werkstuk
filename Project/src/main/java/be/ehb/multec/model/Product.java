package be.ehb.multec.model;

public final class Product extends Mask {
    private static final Product product = new Product();

    private Product(){
    }

    public static Product getInstance(){
        return product;
    }

    @Override
    protected double cost() {
        return 1.25;
    }
}
