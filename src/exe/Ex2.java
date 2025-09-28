package exe;

import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
        System.out.println("enter verbe");
        String verb=sc.nextLine();


       if (verb.endsWith("er")){
           System.out.println("amieneneee");
       }else {
           System.out.println("no verb dont end with er");
       }

        System.out.println("je "+verb.replace("er","e"));
        System.out.println("tu "+verb.replace("er","s"));
        System.out.println("il "+verb.replace("er","e"));
        System.out.println("nous "+verb.replace("er","ons"));
        System.out.println("vous "+verb.replace("er","ez"));
        System.out.println("ils "+verb.replace("er","ent"));

    }
}
