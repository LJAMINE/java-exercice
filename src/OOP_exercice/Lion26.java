package OOP_exercice;

public class Lion26 extends Animal26 {

    public Lion26(String name, int age) {
        super(name, age);

    }

    public void aficher(){
        System.out.println(getId()+name);
    }

    public static void main(String[] args) {
        Lion26 lion26=new Lion26("lions",1);
        Lion26 lion2=new Lion26("bro",2);

        lion26.aficher();
        lion2.aficher();
    }
}
