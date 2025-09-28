package exe;

public class Constructs {
    int price;
    String model;

    public Constructs(int taman,String brand){
     price=taman;
     model=brand;
    }


    public static void main(String[] args){

        Constructs c=new Constructs(123,"toyota");

        System.out.println(c.model+" "+c.price);
     }

}
