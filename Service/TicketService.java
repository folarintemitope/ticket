package com.example.Ticket.Service;

import com.example.Ticket.Repository.TicketRepo;
import com.example.Ticket.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
    public class TicketService {
        @Autowired
        TicketRepo ticketRepo;
        //        public List<Ticket> getAllTicket() {
//            Ticket driverName = new Ticket();
//            getAllTicket().add(driverName);
//            return (List<Ticket>) driverName;
//        }
        public List<Ticket> getAllTodoItems() {

            return ticketRepo.findAll();
        }

        public Ticket getTicket(String vehicleName) {
            return ticketRepo.findById(vehicleName).get();

        }

        public Ticket saveTicket(Ticket ticket) {
            Ticket saveObj = ticketRepo.save(ticket);

            return saveObj;
        }

}
