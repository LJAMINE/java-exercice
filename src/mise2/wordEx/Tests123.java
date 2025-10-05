package mise2.wordEx;

import mise2.ex2.Student3;

import java.util.*;
import java.util.stream.Collectors;

public class Tests123 {

    public static void main(String[] args) {

//        Exercise 1 — Count Word Frequencies-------------------------------

        ArrayList<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "apple", "orange"));
        Map<String, Integer> frequencess = new HashMap<>();

        for (String word : words) {
            if (frequencess.containsKey(word)) {
                frequencess.put(word, frequencess.get(word) + 1);
            } else {
                frequencess.put(word, 1);

            }
        }

//        System.out.println(frequencess);
//        frequencess.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

//        System.out.println(frequencess);

//        Exercise 2 — Filter & Transform---------------------------

        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 3, 15, 15, 20, 25, 30));

        java.util.List<Integer> newAlist = numbers.stream().filter(n -> n % 5 == 0).map(s -> s * 2).toList();
//        System.out.println(newAlist);
//        Exercise 3 — Top Students--------------------------------

        Map<String, ArrayList<Integer>> students = new HashMap<>();
        Map<String, Integer> newHash = new HashMap<>();
        students.put("Alice", new ArrayList<>(List.of(80, 90, 100)));
        students.put("Bob", new ArrayList<>(List.of(70, 85, 95)));
        students.put("Charlie", new ArrayList<>(List.of(90, 60, 75)));

        for (Map.Entry<String, ArrayList<Integer>> s : students.entrySet()) {
//            System.out.println(s);

            java.util.Optional<Integer> sum = s.getValue().stream().reduce((a, b) -> a + b);
//            System.out.println("somme est "+sum.get());
            System.out.println("avg for  " + s.getKey() + " " + sum.get() / s.getValue().size());
            System.out.println("biggest avg    ");

            newHash.put(s.getKey(), sum.get() / s.getValue().size());


        }

        System.out.println(newHash);

        Optional<Map.Entry<String, Integer>> maximum = newHash.entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(maximum);

//        Exercise 4 — Remove Duplicates------------------
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 2, 3, 3, 3, 4, 4, 5));
        ArrayList<Integer> withouDupli = new ArrayList<>();
//
//        Set<Integer> newSet = new HashSet<>(nums);
//        System.out.println(newSet);


        for (int i = 0; i < nums.size(); i++) {
            if (withouDupli.contains(nums.get(i))) {
               continue;
            }else {
                withouDupli.add(nums.get(i));
            }
        }

        System.out.println(withouDupli);

//        List<Integer> newArrList=newSet.stream().filter(s->s>2).toList();
//        System.out.println(newArrList);
    }
}
