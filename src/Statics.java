class Mobile{
    String brand;
    int price;

   static String name;

   public void show(){
       System.out.println(brand+price+name);
   }

   public static void show1(){
       System.out.println("in static method ");
   }
}


public class Statics {

    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        Mobile obj2=new Mobile();

        obj1.price=100;
        Mobile.name="AMINE";
        obj1.brand="HP";

        obj2.price=200;

        obj2.brand="ASUS";

        Mobile.show1();






        obj1.show();
        obj2.show();












      }

}




