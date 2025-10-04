package EX_Listedprénomsuniques;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ex2 {


    public static void main(String[] args) {







////    Exercise 1 — Count Word Frequencies
//
//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("amine");
//        names.add("said");
//        names.add("said");
//        names.add("bro");
//        names.add("amine");
//        names.add("amine");
//
//
//        Map<String, Integer> frequencies = new HashMap<>();
//
//
////        Count how many times each word appears using a HashMap<String, Integer>.
//        for (String i : names) {
//            if (frequencies.containsKey(i)) {
//                frequencies.put(i, frequencies.get(i) + 1);
//            } else {
//                frequencies.put(i, 1);
//            }
//        }
//
//        System.out.println(frequencies);
//
//
//        HashMap<String, Integer> newSorted = (HashMap<String, Integer>) frequencies.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
//
//        System.out.println(newSorted);
//
//
////        Exercise 2 — Filter & Transform
//
//        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 15, 20, 25, 30));
//
//        List<Integer> newLists = numbers.stream().filter(n -> n % 5 == 0).map(n -> n * 2).toList();
//
//        System.out.println(newLists);
//
//
////        Exercise 3 — Top Students
//
//        HashMap<String, ArrayList<Integer>> students = new HashMap<>();
//        students.put("Alice", new ArrayList<>(List.of(80, 90, 100)));
//        students.put("Bob", new ArrayList<>(List.of(70, 85, 95)));
//        students.put("Charlie", new ArrayList<>(List.of(90, 60, 75)));
//
//
//
//        Map<String, Double> newhASH = new HashMap<>();
//        Optional<Map.Entry<String,Double>> maximum = Optional.empty();
//
//
//        for (Map.Entry<String, ArrayList<Integer>> i : students.entrySet()) {
//
//
//            System.out.println("-------------------");
//
//
//            Optional<Integer> somme = i.getValue().stream().reduce((a, b) -> a + b);
//
//            System.out.println(somme.get());
//            double avg= (double) somme.get() /i.getValue().size();
//
//            System.out.println("avg" + somme.get() / i.getValue().size());
//
//            newhASH.put(i.getKey(), avg);
//
//       maximum=newhASH.entrySet().stream().max(Map.Entry.comparingByValue());
//
//        }
//        System.out.println("------------");
//        System.out.println(maximum.get());
//        System.out.println("------------");
//
//
//        System.out.println(newhASH);
//
////        Exercise 4 — Remove Duplicates*
//
//        System.out.println("-------Exercise 4 — Remove Duplicates-----");
//
//        List<Integer>notes=new ArrayList<>(List.of(1,2,2,3,12,22,1,5,12));
//
////        Remove duplicates using HashSet.
////
////        Print numbers greater than 2 using Streams.
//
//
//        Set<Integer>newHashsets=new HashSet<>(notes);
//
//
//        System.out.println(newHashsets);
//
//        List<Integer>filtered=newHashsets.stream().filter(n->n>2).toList();
//        System.out.println(filtered);
//
//
//




    }
}
