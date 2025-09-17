 class Animal {

    public void sound(){
        System.out.println("this is  an animal");
    }
}


class Chien extends Animal{

     public void sound() {
         System.out.println("this a chien ");
     }
}

 class Chat extends Animal{

     public void sound() {
         super.sound();
         System.out.println("this a chat ");
     }
 }



 class  Polymorphysm{
     public static void main(String[] args){
         Animal a=new Animal();
         Chien c=new Chien();
         Chat chat=new Chat();

//         a.sound();
//         c.sound();
         chat.sound();
     }
 }


