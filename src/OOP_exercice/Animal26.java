package OOP_exercice;

public class Animal26 {

    protected String name;
    protected int age ;
   private static int counter=0;
   private int id ;

    public Animal26(String name,int age ){
        this.name=name;
        this.age=age;
         this.id=++counter;
    }
    public int getId(){
        return id;
    }
}
