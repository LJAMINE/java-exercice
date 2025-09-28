package OOP_ex;

import java.util.HashMap;

class Contact25{
    public String name ;
    public String phone  ;

    public Contact25(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class ManagetContact255 {

    HashMap<String,String> storeContact=new HashMap<>();

    public  void addingContacrs(Contact25 contact25){
        storeContact.put(contact25.name, contact25.phone);
    }

    public void removeByName(String name){
        storeContact.remove(name);
    }

    public void searchByName(String name ){
         String phone=storeContact.get(name);

         if (phone==null){
             System.out.println("not found");
         }else{
             System.out.println("found "+name);
         }
    }

    public  void displayAll(){
        for (String name : storeContact.keySet()){
            System.out.println(name+" "+storeContact.get(name));
        }
    }
}



public class PhoneBookHashMap {
    public static void main(String[] args) {

        Contact25 c1=new Contact25("AMINE","09191");
        Contact25 c2=new Contact25("SAID","111111");

        ManagetContact255 managetContact255=new ManagetContact255();
        managetContact255.addingContacrs(c1);
        managetContact255.addingContacrs(c2);

        managetContact255.displayAll();

        managetContact255.removeByName("AMINE");

        System.out.println("---------------------------");
        managetContact255.displayAll();
        System.out.println("---------------------------");
        managetContact255.searchByName("SAID");





    }

}
