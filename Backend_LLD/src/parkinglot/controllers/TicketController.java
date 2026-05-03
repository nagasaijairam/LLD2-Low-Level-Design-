package parkinglot.controllers;

import parkinglot.Models.Ticket;
import parkinglot.dtos.IssueTicketRequestDTO;
import parkinglot.dtos.IssueTicketResponseDTO;
import parkinglot.dtos.ResponseStatus;
import parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.IssueTicket(
                    requestDTO.getVehicleNumber(),
                    requestDTO.getOwnerName(),
                    requestDTO.getGateId(),
                    requestDTO.getOperatorId()
            );
            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
