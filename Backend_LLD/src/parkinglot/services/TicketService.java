package parkinglot.services;

import parkinglot.Models.Gate;
import parkinglot.Models.Ticket;
import parkinglot.Models.Vehicle;
import parkinglot.exceptions.GateNotFoundException;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategies.ParkingSpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    public GateRepository gateRepository;
    public VehicleRepository vehicleRepository;
    public ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
    }


    public Ticket IssueTicket(String vehicleNo,
                              String ownerName,
                              Long gateId,
                              Long operatorId) throws GateNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());


        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        if (optionalGate.isEmpty()){
            throw new GateNotFoundException("Gate with id " + gateId + " not found");
        }
        Gate gate = optionalGate.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());

        Optional<Vehicle> optionalVehicle = vehicleRepository.findByNumber(vehicleNo);
        Vehicle vehicle = null;
        if (optionalVehicle.isEmpty()){
            //Vehicle is not present in the DB.
            //Create a new Vehicle and insert in to the db.
            vehicle = new Vehicle();
            vehicle.setNumber(vehicleNo);
            vehicle.setOwnerName(ownerName);
           vehicle = vehicleRepository.save(vehicle);
        }else{
            vehicle = optionalVehicle.get();
        }
        ticket.setVehicle(vehicle);
        int gateNumber = gate.getGateNumber();
//        ticket.setParkingSpot(parkingSpotAssignmentStrategy.asignParkingSpot(ParkingLot, vehicle));

        return null;
    }





}


/*
Service class should be as generic as possible because it will interact with a lot of other services as well.
*/

