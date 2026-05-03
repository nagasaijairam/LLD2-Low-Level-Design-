package parkinglot.repositories;

import parkinglot.Models.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {

    //Replacement of the Gate table in db.
    private HashMap<Long, Gate> gates = new HashMap<>();
    // CRUD operations on Gate table.

    public Optional<Gate> findGateById(long id) {
        return Optional.of(gates.get(id));
    }


}
