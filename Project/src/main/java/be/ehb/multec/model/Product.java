package be.ehb.multec.model;

public class Product {
   private int id;
   private static final Client client = new Client();   // is het beter om client niet private static te zetten ?, best om verschillende obj van elk client te hebben.
   private static final Product product = new Product();

   private Product(){

   }
   public Product getInstance(){
       return product;
   }

   public int getId(){
       return this.id;
   }

   public Client getClient(){
       return client;
   }
}
