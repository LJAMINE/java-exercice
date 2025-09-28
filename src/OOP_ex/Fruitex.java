package OOP_ex;

import exe.Array;
import exe.Strings;

import java.util.*;

public class Fruitex {

    public static void main(String[] args) {
//        HashMap<String, Double> storeMap =new HashMap<>();
//        TreeMap<String, Double> storeTree =new TreeMap<>();
//        LinkedHashMap<String, Double> storeLinked =new LinkedHashMap<>();
//
//
//        storeLinked.put("apple",12.1);
//        storeLinked.put("watermelon",10.22);
//        storeLinked.put("banana",1.2);
//        storeLinked.put("grape",7.5);
//
////        System.out.println(storeLinked);
//
//
//        for (Double i : storeLinked.values()){
//            System.out.println(i);
//        }

//-------------------------------------------------------------------------
//        HashMap<String,Integer> storeNote=new HashMap<>();
//
//        storeNote.put("amine",12);
//        storeNote.put("ali",4);
//        storeNote.put("said",44);
//        storeNote.put("grady",34);
//        storeNote.put("mam",16);


//        storeNote.put("ali",20);
//        System.out.println(storeNote.get("amine"));;
//        System.out.println(storeNote);


//        for (int i : storeNote.values()){
//            System.out.println(i);
//        }

//        for (Map.Entry<String, Integer> i : storeNote.entrySet()){
//            System.out.println(i);
//        }


        //-------------------------------------------------------------------------

//        HashSet<Integer> store=new HashSet<Integer>();
//
//        store.add(5);
//        store.add(4);
//        store.add(2);
//        store.add(2);
//        store.add(1);
//
//        System.out.println(store);


        //-------------------------------------------------------------------------

//        ArrayList<Integer> store=new ArrayList<>();
//
//        store.add(5);
//        store.add(4);
//        store.add(2);
//        store.add(2);
//        store.add(1);
//
//        int count=0;
//for (int i=0;i<store.size();i++){
//  if (store.contains(i) ){
//      count++;
//  }
//if (count==2){
//    store.remove(i);
//
//}


//        System.out.println(store);


//        LinkedHashSet<Integer>uniqueNumbers = new LinkedHashSet<>(store);
//
//        System.out.println(uniqueNumbers);

        //-------------------------------------------------------------------------
//        ArrayList<Integer> numbers=new ArrayList<>();
//        ArrayList<Integer> numbersnotNull=new ArrayList<>();
//
//        numbers.add(2);
//        numbers.add(null);
//        numbers.add(22);
//        System.out.println(numbers);
//
//     for (Integer i : numbers){
//         if (i!=null){
//             numbersnotNull.add(i);
//         }
//     }
//
//     int max= numbersnotNull.get(0);
//        for (Integer i = 0; i < numbersnotNull.size() ; i++) {
//            if (max>numbersnotNull.get(i)){
//                max=numbersnotNull.get(i);
//            }
//        }
//
//        System.out.println(max);
//
//        System.out.println(numbersnotNull);
//


        //-------------------------------------------------------------------------
//        ArrayList<Integer> numbers=new ArrayList<>();
//        ArrayList<Integer> uniqueNumbers=new ArrayList<>();
//
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(2);
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(5);
//
//for (Integer num : numbers){
//    if (uniqueNumbers.contains(num)){
//        continue;
//    }else{
//        uniqueNumbers.add(num);
//    }
//}
//
//        System.out.println(uniqueNumbers);
        //-------------------------------------------------------------------------
//        Exercise 6: Union & Intersection

//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//        HashSet<Integer> setUnion  = new HashSet<>();
//
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//
//
//        setUnion.addAll(set1);
//        setUnion.addAll(set2);
//
//         System.out.println(setUnion);
//
//

//        Exercise 7: Shopping List -----------------

//        ArrayList<String> stock=new ArrayList<>();
//
//        stock.add("Milk");
//        stock.add("Eggs");
//        stock.add("Bread");
//
//        stock.add(1,"Butter");
//        stock.remove(2);
//
//        System.out.println(stock);


//        Map<String, String> countries = new HashMap<>();
//        Map<String, String> countriesLinked = new LinkedHashMap<>();
//        Map<String, String> countriesTree = new TreeMap<>();
//
//
//        countries.put("maroc", "rabat");
//        countries.put("spain", "madrid");
//        countries.put("Italy", "Rome");
//        countries.put("Italy", "Napoly");
//
//        countriesLinked.put("maroc", "rabat");
//        countriesLinked.put("spain", "madrid");
//        countriesLinked.put("Italy", "Rome");
//        countriesLinked.put("Italy", "Napoly");
//
//        countriesTree.put("maroc", "rabat");
//        countriesTree.put("spain", "madrid");
////        countriesTree.put("Italy", "Rome");
////
//
//        System.out.println(countries);
//        System.out.println("-----------------");
//        System.out.println(countriesLinked);
//        System.out.println("-----------------");
//        System.out.println(countriesTree);
//
//
//        System.out.println(countries.get("Italy")
//        );
//
//
//
//
//      Set<String> count  =countries.keySet();
//        for (String i : countries.keySet()){
//            System.out.println(i);
//        }
//        System.out.println("---------------------------");
//
//        for (String i : countries.values()){
//            System.out.println(i);



        Map<String, Integer> countries = new HashMap<>();
        List<String> names = new ArrayList<>();


        countries.put("amine", 1);
        countries.put("said ", 18);
        countries.put("aaha", 22);
        countries.put("ajak", 1);


        for (Map.Entry<String,Integer> i : countries.entrySet()){
            if (i.getValue()>12){
                names.add(i.getKey());
            }
        }

        System.out.println(names);





//        HashSet<Integer> note=new HashSet<>();
//
//ArrayList<Integer> stock =new ArrayList<>();
//
//
//        note.add(1);
//        note.add(2);
//        note.add(3);
//        note.add(4);
//
//
//
//        for (int i : note) {
//            if (i!=1){
//                stock.add(i);
//            }
//        }
//
//        System.out.println(stock);
    }

}
