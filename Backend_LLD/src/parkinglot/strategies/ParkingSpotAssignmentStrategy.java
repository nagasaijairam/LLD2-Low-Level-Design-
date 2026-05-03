package parkinglot.strategies;

import parkinglot.Models.ParkingFloor;
import parkinglot.Models.ParkingLot;
import parkinglot.Models.ParkingSpot;
import parkinglot.Models.Vehicle;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot asignParkingSpot(ParkingLot parkingLot,Vehicle vehicle);
}
