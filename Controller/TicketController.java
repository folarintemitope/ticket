package com.example.Ticket.Controller;

    import com.example.Ticket.Service.TicketService;
import com.example.Ticket.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path="/ticket")
    public class TicketController {
        @Autowired
        private TicketService ticketService;
        @GetMapping
        public List<Ticket> viewAllTicket() {
            return (List<Ticket>) ticketService.getTicket("corolla");

        }

        @PostMapping
        public Ticket saveTodoItem(@RequestBody Ticket ticket) {
            Ticket saved = ticketService.saveTicket(ticket);
            return saved;
        }



    }
