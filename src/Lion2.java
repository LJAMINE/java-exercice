public class Lion2 extends Animals2  {
    String name;


    public Lion2(String newspecies,double newweight,String name){
        super(newspecies,newweight);
        this.name=name;
    }

   @Override
    void makeSound(){
       System.out.println("i am a lion ");
   }
}
