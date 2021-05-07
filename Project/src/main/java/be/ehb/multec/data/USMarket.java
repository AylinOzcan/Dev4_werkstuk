package be.ehb.multec.data;

public class USMarket {

   private double cost(){
        return 1.50;
    }

    public void maskInDollar() {
        System.out.println("Mask costs $" + cost());
    }
}
