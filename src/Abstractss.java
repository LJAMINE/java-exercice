abstract class Animals{
    int age;

    public abstract void sound();

    public void afficher(){
        System.out.println("afficher name");
    }
}

class newchat extends Animals{
    public void sound(){
        System.out.println("this is amine ");
    }
}


 class Abstractss  {

    public static void main(String[] args){

newchat n=new newchat();
n.sound();
    }
}
