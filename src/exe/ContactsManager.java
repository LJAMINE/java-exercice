package exe;

import java.util.ArrayList;
import java.util.HashSet;

class Contact22 {
    public String name;
    public String phoneNumber;

    public Contact22(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class ContactManager22{
    ArrayList<Contact22> storeContact;
    HashSet<String> uniquePhonenbr;

    public  ContactManager22(){
        this.storeContact=new ArrayList<>();
        this.uniquePhonenbr=new HashSet<>();
    }

    public void addContact(Contact22 contact22){
        storeContact.add(contact22);
        uniquePhonenbr.add(contact22.phoneNumber);
     }

     public  void searchByName(String name){
        for (Contact22 c : storeContact){
            if (c.name.equals(name)){
                System.out.println("we found "+c.name+c.phoneNumber);
            }
        }
     }

     public void printme(){
        for (Contact22 c : storeContact){
            System.out.println(c.name+c.phoneNumber);
        }
     }
}

public class ContactsManager {
    public static void main(String[] args) {
        Contact22 c1=new Contact22("amio","123");
        Contact22 c2=new Contact22("zeos","23");

        ContactManager22 contactManager22=new ContactManager22();
        contactManager22.addContact(c1);
        contactManager22.addContact(c2);
        contactManager22.printme();
        contactManager22.searchByName("amio");
    }

}
