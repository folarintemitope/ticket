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

        public List<Ticket> getAllTicket(String ticketNo) {
          if (null != ticketNo){
            return ticketRepo.findAllByTicketNo(ticketNo);
        } else {
          return ticketRepo.findAll();
          }
        }

        public Ticket saveAllTicket(Ticket ticket) {
            return  ticketRepo.save(ticket);
        }

        public void deleteTicket(String ticketNo) {
            ticketRepo.deleteById(ticketNo);
        }

    }
