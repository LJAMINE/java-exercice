package Stream.EX21;

public class mains {
    public static void main(String[] args) {
        Zoo27 zoo27 = new Zoo27();

        Lion27 lion27 = new Lion27("LION1", 20);
        Lion27 lion23 = new Lion27("LION2", 2);
        Elephant27 elephant27 = new Elephant27("elephant1", 15);
        Elephant27 elephant288 = new Elephant27("elephant2", 1);

        zoo27.addAnimal(lion27);
        zoo27.addAnimal(lion23);
        zoo27.addAnimal(elephant27);
        zoo27.addAnimal(elephant288);
        zoo27.listAnimals();
        System.out.println("-----------------");
        zoo27.getAnimalsOlderThan(5);
        System.out.println("-----------------");
        zoo27.getAnimalNames();
        System.out.println("-----------------");
        zoo27.oldest();
        System.out.println("-----------------");
zoo27.countLion();

    }
}
