package exe;//The this keyword in Java refers to the current object in a method or constructor.



public class This {

    int prix;
    String name;

    public This(int taman,String model){
this.name=model;
this.prix=taman;;
    }

    public static void main(String[] args){
This t=new This(12,"&éééé");

        System.out.println(t.prix+" "+t.name);
    }
}
