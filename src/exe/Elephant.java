package exe;

public class Elephant extends Animals2{
    String parts;

    public Elephant(String newspecies,double newweight,String parts){
        super(newspecies,newweight);
        this.parts=parts;
    }

    @Override
    void makeSound() {
        System.out.println("i am elephant ");

    }
}
