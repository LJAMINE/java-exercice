package OOP_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EX4_array_hashset_hashmap {

//    ArrayList Exercise

    public static void main(String[] args) {


        ArrayList<String> noms=new ArrayList<String>();
        noms.add("amine");
        noms.add("said");
        noms.add("aziz");
        noms.add("aziz");

        for (int i = 0; i <noms.size() ; i++) {
            System.out.println(noms.get(i));
        }

        System.out.println(noms);


        noms.remove(0);

        System.out.println(noms.size());

        System.out.println(noms);

//        HashSet Exercise

        HashSet<String> emails=new HashSet<String>();
        emails.add("amine@gmail.com");
        emails.add("said@gmail.com");
        emails.add("bro@gmail.com");
         emails.add("bro@gmail.com");

        System.out.println(emails);

        System.out.println(emails.contains("saidss@gmail.com"));


//        HashMap Exercise

        HashMap<String,String> phonebook = new HashMap<String,String>();
        phonebook.put("amine","01010101");
        phonebook.put("skskksks","0101013301");
        phonebook.put("said","118828");


        System.out.println(phonebook.get("amine"));

        phonebook.remove("said");

        System.out.println(phonebook);
    }
}
