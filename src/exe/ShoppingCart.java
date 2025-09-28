package exe;

import java.util.HashMap;

class Product{
    public int id;
    public String name;
    public double price;


    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

   class Cart{
    HashMap<Product,Integer> storeProducts;

    public  void addProduct(Product product,int quantity){
        storeProducts.put(product,quantity);
    }


//    public void affichageCartContent(){
//
//        for (Product product : storeProducts){
//
//        }
//    }

}


public class ShoppingCart {
    public static void main(String[] args) {

    }

}
