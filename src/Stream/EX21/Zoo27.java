package Stream.EX21;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Zoo27 {

    ArrayList<Anima27> storeAnima = new ArrayList<>();


    public void addAnimal(Anima27 a) {
        storeAnima.add(a);
    }

    public void listAnimals() {
        for (Anima27 a : storeAnima) {
            System.out.println(a.getName() + a.getAge());
        }
    }

    public void getAnimalsOlderThan(int age) {
        List<Anima27> olderthan = storeAnima.stream().filter(a -> a.getAge() > age).toList();
        for (Anima27 a : olderthan) {
            System.out.println(a);
        }
    }

    public void getAnimalNames() {
        storeAnima.stream().map(Anima27::getName).toList().forEach(System.out::println);
    }

    public void countLion() {
        long num = storeAnima.stream().filter(n -> n instanceof Lion27).count();
        System.out.println(num);
    }

    public void oldest() {
        Optional<Anima27> oldest = storeAnima.stream().reduce((a, b) -> a.getAge() > b.getAge() ? a : b);
        oldest.ifPresent(System.out::println);
    }

}