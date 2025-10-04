package collection_stream_optional;

public class Truck extends Vehicle {
 int payloadCapacity;


    public Truck(int id, String brand, String model, String year,int payloadCapacity) {
        super(id, brand, model, year);
        this.payloadCapacity=payloadCapacity;
    }


    @Override
    public void displayInfo() {
        System.out.println("this is a truck ");
    }
}
