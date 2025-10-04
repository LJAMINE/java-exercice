package collection_stream_optional;

import java.util.List;

public class MyMain {
    public static void main(String[] args) {

        Car car = new Car(1, "BMW", "new", "1999", 12);
        Car car2 = new Car(2, "mercedes", "old", "2000", 11);
        Car car3 = new Car(3, "zara", "new", "2001", 2);
        Truck tr1 = new Truck(4, "truckss", "new", "1998", 33);
        Truck tr2 = new Truck(4, "newTruck", "AZER", "1293", 12);

        Garage g = new Garage();
        g.addVehicle(tr1);
        g.addVehicle(car);
        g.addVehicle(car2);
        g.addVehicle(car3);

        System.out.println("--------------------get all -------");

        System.out.println(g.getAllVehicule());
        System.out.println("--------------------find-------");
        System.out.println(g.findVehiculeById(1));
        System.out.println("----------------Update-----------");
        g.updateVehicle(tr2);
        System.out.println("---------------------------");
        System.out.println(g.findVehiculeById(4));
        System.out.println("------------delete--------------");
        g.deleteVehicle(3);
        System.out.println(g.getAllVehicule());

        System.out.println("------------Print all vehicles, using Streams to filter (e.g., show only cars or trucks)-------------");

        List<Vehicle> filteredCar=g.getAllVehicule().stream().filter(v->v instanceof Truck).toList();

        System.out.println(filteredCar);





    }
}
