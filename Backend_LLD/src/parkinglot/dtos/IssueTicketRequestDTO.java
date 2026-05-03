package parkinglot.dtos;

import parkinglot.Models.VehicleType;

public class IssueTicketRequestDTO {
    private String vehicleNumber;
    private String ownerName;
    private Long gateId;
    private Long operatorId;


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleId) {
        this.vehicleNumber = vehicleId;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
