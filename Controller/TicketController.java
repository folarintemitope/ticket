package com.example.Ticket.Controller;

import com.example.Ticket.Model.Ticket;
import com.example.Ticket.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/todo")
public class TicketController {
    @Autowired
    private TicketService ticketService;


    @GetMapping
    public List<Ticket> viewAllTicket() {
        return ticketService.getAllTicket();

    }

    @PostMapping
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        Ticket savedTicket = ticketService.saveAllTicket(ticket);
        return savedTicket;
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable String customerId) {
        ticketService.deleteTicket(customerId);
    }

    @PutMapping
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        Ticket savedTicket = ticketService.updateTicket(ticket);
        return savedTicket;
    }
}