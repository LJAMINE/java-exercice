package collection_stream_optional;

public class Car extends Vehicle {
    int numberOfDoors;


    public Car(int id, String brand, String model, String year,int numberOfDoors) {
        super(id, brand, model, year);
        this.numberOfDoors=numberOfDoors;
    }


    @Override
    public void displayInfo() {
        System.out.println("this is a Car ");
    }
}
