
class Vehicule{
    protected  String brand="BMW";

    public void sound(){
        System.out.println("this a car sound ");
    }
}


 class Inheritance extends Vehicule {

    public static void main(String[] args){

        Vehicule v=new Vehicule();

        v.sound();
        System.out.println(v.brand);
    }

}
