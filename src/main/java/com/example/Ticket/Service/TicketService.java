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

        public List<Ticket> getAllTicket(Long ticketNo) {
          if (null != ticketNo){
            return ticketRepo.findAllByTicketNo(ticketNo);
        } else {
          return ticketRepo.findAll();
          }
        }
        public List<Ticket> getTicket(){
            return ticketRepo.findAll();
        }

        public Ticket saveAllTicket(Ticket ticket) {

            return  ticketRepo.save(ticket);
        }

        public void deleteTicket(Long ticketNo) {

            ticketRepo.deleteById(ticketNo);
        }

        public Ticket updateTicket(Ticket ticket, Long ticketNo){
            Ticket ticket1= ticketRepo.findById(ticketNo).orElseThrow(
                    () -> new IllegalStateException("ticket with id" + ticketNo + "does not exist"));
            return ticketRepo.save(ticket);
        }

    }
