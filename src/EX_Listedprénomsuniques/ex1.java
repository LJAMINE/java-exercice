package EX_Listedprénomsuniques;

import exe.Array;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex1 {


    public static void main(String[] args) {

//        1️⃣ Liste de prénoms uniques

        ArrayList<String> list = new ArrayList<>();

        list.add("amine");
        list.add("amine");
        list.add("said");
        list.add("bro");
        list.add("bro");
        list.add(null);
        list.add("samira");


//          list.stream().filter(n->n!=null).distinct().forEach(System.out::println);

        List<String> newList = list.stream().filter(Objects::nonNull).distinct().toList();

        System.out.println(newList);


//     2️⃣ Total de notes
        ArrayList<Integer> note = new ArrayList<>();

        note.add(12);
        note.add(1);
        note.add(2);
        note.add(3);
        int somme = 0;
        for (Integer i : note) {
            somme += i;
        }
        double avg = somme / note.size();

        System.out.println(somme);
        System.out.println(avg);


//        3️⃣ Recherche d’un mot

//        ArrayList<String>nomes=new ArrayList<>();
//
//        nomes.add("amine");
//        nomes.add("said");
//        nomes.add("bro");
//        nomes.add("great");
//
//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("entrer nom");
//        String nom=sc.nextLine();

//             if (nomes.contains(nom)){
//                System.out.println("  found ");
//
//            }else {
//                System.out.println("not found ");
//            }


//             Optional<String> res= nomes.stream().filter(n->n.equalsIgnoreCase(nom)).findFirst();
//
//             if (res.isPresent()){
//                 System.out.println("found "+ res.get());
//             }else {
//                                 System.out.println("not found ");
//
//             }


//        4️⃣ Catalogue simplifié (HashMap)

        Map<String, Double> product = new HashMap<>();
        product.put("apple", 12.2);
        product.put("alimentaires", 1009.1);
        product.put("green", 1200.0);

        System.out.println("hhhhhhhhhhhhhhhhhhh");
        product.entrySet().stream().filter(n -> n.getValue() > 100).forEach(System.out::println);

        product.entrySet().stream().filter(f -> f.getKey().equals("alimentaires")).map(n -> n.getValue() * 2).forEachOrdered(System.out::println);


//        5️⃣ Compter les occurrences

        ArrayList<String> mots = new ArrayList<>();


        mots.add("amine");
        mots.add("said");
        mots.add("amine");
        mots.add("said");
        mots.add("amine");

        Map<String, Integer> freq = new HashMap<>();

        int count = 0;

        for (String i : mots) {

            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        System.out.println(freq);


//        6️⃣ Étudiants et moyennes

        HashMap<String, ArrayList<Integer>> notes = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(2);
        num.add(2);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(1);
        num2.add(1);
        num2.add(7);

        notes.put("samir", num);
        notes.put("zara", num2);

        HashMap<String, Double> newAVG = new HashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> i : notes.entrySet()) {
            Optional<Integer> newsome = i.getValue().stream().reduce(Integer::sum);

            int sommess = newsome.get();

            double moy = (double) sommess / i.getValue().size();
            System.out.println(i + "" + newsome + "" + moy);

            newAVG.put(i.getKey(), moy);

        }

        System.out.println(newAVG);


        Optional<Double> maxValue = newAVG.values().stream().max(Double::compare);

        System.out.println(maxValue.get());


        ArrayList<Integer> nambers = new ArrayList<>();

        nambers.add(2);
        nambers.add(3);
        nambers.add(8);
        nambers.add(1);


        Optional<Integer> maxvall = nambers.stream().max(Integer::compare);

        System.out.println(maxvall.get());


//        7️⃣ Gestion de stock


        HashMap<String, Integer> produits = new HashMap<>();

        produits.put("apple", 0);
        produits.put("tomato", 5);
        produits.put("butter", -1);
        produits.put("apple2", 0);
        produits.put("potato", 30);


        produits.entrySet().stream().filter(n -> n.getValue() == 0).forEach(System.out::println);
        System.out.println("''''''''''''''''''''''''''''''''");
//       java.util.HashMap<String,Integer>anotherFilteredMap  = (HashMap<String, Integer>) produits.entrySet().stream().filter(n->n.getValue()!=0).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//        System.out.println("-----------------------------");
//        System.out.println(anotherFilteredMap);
        System.out.println("-------------------negative----------");

        produits.entrySet().removeIf(e -> e.getValue() < 0);
        System.out.println(produits);

        System.out.println("-----------------------------");
        Optional<Integer> maximum = produits.values().stream().reduce(Integer::max);
        System.out.println(maximum.get());


//        8️⃣ Recherche conditionnelle

        System.out.println("-----------------max 30------------");

        ArrayList<Integer> ages = new ArrayList<>(List.of(2, 32, 40, 30));

        Optional<Integer> firstmaximum = ages.stream().filter(n -> n % 2 == 0 && n > 30).findFirst();
        System.out.println(firstmaximum);


//        Exercise 6 – Cities
//        Create a new list of unique city names (remove duplicates) while keeping the original order.

        ArrayList<String> cities = new ArrayList<>(List.of("Berlin", "agadir", "Rome", "Paris", "agadir", "Berlin"));

        ArrayList<String> newhomes = new ArrayList<>(cities.stream().distinct().toList());

        System.out.println(newhomes);


//        Exercise 7 – Stock Management


        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Laptop", 5);
        stock.put("Phone", 0);
        stock.put("Keyboard", 12);
        stock.put("Mouse", -2);
        stock.put("Monitor", 700);
        stock.put("aaa", 2);

//        Find the product with the highest quantity.
        stock.entrySet().stream().filter(n -> n.getValue() == 0).forEach(System.out::println);
//        Remove products with invalid quantities.
        stock.entrySet().removeIf(n -> n.getValue() < 0);
        System.out.println(stock);
//        Find the product with the highest quantity.
//        Optional<Integer>val =stock.values().stream().reduce(Integer::max);
        Optional<Map.Entry<String, Integer>> val = stock.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(val);


//        Exercise 8 – Temperatures
        ArrayList<Integer> temps = new ArrayList<>(List.of(12, 25, 30, 18, 40, 22, 35));

//        Filter or select temperatures based on conditions of your choice.
        System.out.println("-----------------Filter or select temperatures based on conditions of your choice.------------");

        temps.stream().filter(n -> n > 20).forEach(System.out::println);
        System.out.println("-----------------Perform calculations or find specific values from the list.------------");

        temps.stream().filter(n -> n == 40).map(n -> n * 2).forEach(System.out::println);


//        Exercise 9 – Student Scores

        HashMap<String, ArrayList<Integer>> students = new HashMap<>();

        students.put("amine", new ArrayList<>(List.of(10, 2, 17, 1)));
        students.put("Said", new ArrayList<>(List.of(8, 9, 7, 10)));
        students.put("Samira", new ArrayList<>(List.of(15, 18, 17, 16)));

        System.out.println("-----------------Calculate the average score of each student..------------");

        HashMap<String, Double> avhNotes = new HashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> s : students.entrySet()) {
            Optional<Integer> sommess = s.getValue().stream().reduce((a, b) -> a + b);
            System.out.println(sommess);
            System.out.println(sommess.get() / s.getValue().size());

            avhNotes.put(s.getKey(), (double) (sommess.get() / s.getValue().size()));

        }

        System.out.println(avhNotes);

        Optional<Double> maxx = avhNotes.values().stream().reduce(Double::max);

        System.out.println(maxx.get());


//        recap

      Map<String,Integer> produitssc=new HashMap<>();

        produitssc.put("tide",2);
        produitssc.put("sabon",20);
        produitssc.put("sabon1",-2);
        produitssc.put("zara",29);
        produitssc.put("somo",0);
        produitssc.put("fromage",30);



        Map<String,Integer>newHash=produitssc.entrySet().stream().filter(n->n.getValue()>10).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));



        System.out.println("----------------------");
        System.out.println(newHash);

    }


}
