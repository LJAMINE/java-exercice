package collection_stream_optional;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository {

    void addVehicle(Vehicle v);

    void updateVehicle(Vehicle v);

    void deleteVehicle(int id);

    Optional<Vehicle> findVehiculeById(int id);

    List<Vehicle> getAllVehicule();
}
