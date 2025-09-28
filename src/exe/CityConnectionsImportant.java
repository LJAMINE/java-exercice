package exe;

import java.util.HashMap;
import java.util.HashSet;

class City {
    public String name;

    public City(String name) {
        this.name = name;
    }
}

class CityNetwork{
    public HashMap<String, HashSet<String>> connections;

    public CityNetwork(){
        connections=new HashMap<>();
    }

    public void addCity(City city){
        connections.putIfAbsent(city.name, new HashSet<>());
    }

    public  void connectCities(City city1,City city2){
        if (connections.containsKey(city1)|| connections.containsKey(city2)){
            connections.get(city1).add(city2.toString());
            connections.get(city2).add(city1.toString());
        }
    }

}

public class CityConnectionsImportant {

    public static void main(String[] args) {

    }
}
