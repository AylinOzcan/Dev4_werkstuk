package be.ehb.multec.model;

public class Product {
   private int id;
   private static final Client client = new Client();
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
