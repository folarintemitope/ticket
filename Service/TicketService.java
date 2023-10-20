package com.example.Ticket.Service;

import com.example.Ticket.Model.Customer;
import com.example.Ticket.Repository.TicketRepo;
import com.example.Ticket.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
    public class TicketService {
        @Autowired
        TicketRepo ticketRepo;

        public List<Ticket> getAllTicket() {

            return ticketRepo.findAll();
        }

        public Ticket getTicketByDriverId(String customer) {
            return ticketRepo.findById(customer).get();

        }

        public Ticket saveAllTicket(Ticket ticket) {
            Ticket saveO = ticketRepo.save(ticket);

            return saveO;
        }

        public void deleteTicket(String ticketNo) {
            ticketRepo.deleteById(ticketNo);
        }

        public Ticket updateTicket(Ticket ticket) {
            String Driver = ticket.getTicketNo();
            Ticket updated = ticketRepo.findById(ticket.getTicketNo()).get();
            updated.setTicketNo(ticket.getTicketNo());
            updated.setDriverId(ticket.getDriverId());
            updated.setDriverName(ticket.getDriverName());
            updated.setFfromCity(ticket.getFfromCity());
            updated.setToCity(ticket.getToCity());
            updated.setVehicleName(ticket.getVehicleName());
            updated.setSeatingCapacity(ticket.getSeatingCapacity());
            updated.setTravellerNo(ticket.getTravellerNo());
            updated.setAvailability(ticket.getAvailability());

            return ticketRepo.save(updated);
        }
    }
