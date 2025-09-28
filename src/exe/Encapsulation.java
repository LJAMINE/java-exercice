package exe;

public class Encapsulation {

    private int age;

    public Encapsulation(int constage ){
        this.age=constage;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        this.age=newAge;
    }

    public static void main(String[] args){
        Encapsulation e=new Encapsulation(12);
        int aa=e.getAge();
        System.out.println(aa);

    }
}


