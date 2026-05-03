package parkinglot.repositories;

import parkinglot.Models.Gate;
import parkinglot.Models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    public Vehicle save(Vehicle vehicle) {
        return null;
    }
    public Optional<Vehicle> findById(Long id) {
        return Optional.empty();
    }

    public Optional<Vehicle> findByNumber(String vehicleNumber) {
        return Optional.empty();
    }
}
