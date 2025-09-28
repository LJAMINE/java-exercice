package Stream;

import java.util.*;

public class EX {

    public static void main(String[] args) {


//        🔹 Exercise 1: Names with "A"----------------------------

        List<String> names = Arrays.asList("amine", "omar", "said", "adil");

        List<String> newName = names.stream().filter(name -> name.startsWith("a")).toList();

        for (String n : newName) {
            System.out.println(n);
        }


        names.stream().filter(name -> name.startsWith("a")).forEach(System.out::println);


        System.out.println("------------------------");
//        🔹 Exercise 2: Square Numbers-------------------------------

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        numbers.stream().map(num -> num * num).forEach(System.out::println);

        System.out.println("------------------------");

//        🔹 Exercise 3: Sum of Even Numbers--------------------------

        List<Integer> numero = Arrays.asList(2, 5, 6, 1);

        List<Integer> newstock = numero.stream().filter(num -> num % 2 != 0).toList();
        System.out.println("-------------filter-----------");


        System.out.println(newstock);

        Optional<Integer> somme = newstock.stream().reduce((a, b) -> a + b);
        System.out.println(somme);

        System.out.println("------------------------");


//        🔹 Exercise 4: Longest Word-------------------------
        List<String> words = Arrays.asList("java", "stream", "aaaaaaaaaaaaaa", "map", "reduce");

         Optional<String>wordss =words.stream().reduce((a, b)-> a.length()>b.length()?a:b);

        System.out.println(wordss);

        System.out.println("------------------------");
//        🔹 Exercise 5: Count Unique Numbers

        List<Integer>numbersArray=Arrays.asList(1,2,3,2,5);

        long a=numbersArray.stream().distinct().count();

        System.out.println(a);






    }
}
