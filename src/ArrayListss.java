import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;


public class ArrayListss {
    public static void main(String[] args) {

    ArrayList<String>cars=new ArrayList<String>();

    cars.add("volvo");
    cars.add("bro");
    cars.add("bro");
    cars.add("volvo");

        System.out.println(cars);




        HashSet<String>names=new HashSet<String>();

        names.add("volvo");
        names.add("aaa");
        names.add("ss");
        names.add("s");
        names.add("volvo");

        System.out.println(names);


        HashMap<String,String> capiltalOfCitie=new HashMap<String,String>();

        capiltalOfCitie.put("england","Londo");
        capiltalOfCitie.put("spain","madrid");
        capiltalOfCitie.put("USA","Texas");
        capiltalOfCitie.put("france","paris");
        capiltalOfCitie.put("france","paris");

        System.out.println(capiltalOfCitie);


        ArrayList<Integer> notes=new ArrayList<Integer>();

        notes.add(22);
        notes.add(3);
        notes.add(4);
        notes.add(7);

        Collections.sort(notes);

        System.out.println(notes);


    }
}
