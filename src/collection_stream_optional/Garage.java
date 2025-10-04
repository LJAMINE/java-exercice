package collection_stream_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garage implements VehicleRepository {

    ArrayList<Vehicle> stock = new ArrayList<>();


    @Override
    public void addVehicle(Vehicle v) {
        stock.add(v);
    }

    @Override
    public void updateVehicle(Vehicle v) {
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getId()==v.getId()){
                stock.set(i,v);
            }
        }
    }

    @Override
    public void deleteVehicle(int id) {
        stock.remove(id);
    }

    @Override
    public Optional<Vehicle> findVehiculeById(int id) {

        Optional<Vehicle> ve = stock.stream().filter(v -> v.getId() == id).findFirst();

        return ve;
    }

    @Override
    public List<Vehicle> getAllVehicule() {
        return stock;
    }
}
