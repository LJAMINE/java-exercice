package exe;

class MMain {

    public int age =12;

    private String name="AMINE";

    protected int price=111;

      static void myStaticMethod() {
          System.out.println("Static methods can be called without creating objects");
      }
}


   public class AccessModifier{
       public static void main(String[] args){

           MMain a=new MMain();

           System.out.println(a.age);
//           System.out.println(a.name);
           System.out.println(a.price);


           MMain.myStaticMethod();

       }

   }

