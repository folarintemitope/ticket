package com.example.Ticket.Controller;

import com.example.Ticket.Model.Ticket;
import com.example.Ticket.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;


    @GetMapping("/create_ticket/{ticketNo}")
    public List<Ticket> viewAllTicket(@PathVariable Long ticketNo) {
        return ticketService.getAllTicket(ticketNo);

    }

    @PostMapping("/save_ticket")
    public ResponseEntity <Ticket> saveTicket(@RequestBody Ticket ticket) {
        Ticket ticketSaved = ticketService.saveAllTicket(ticket);
        return ResponseEntity.status(HttpStatus.CREATED).body(ticketSaved);
    }

    @DeleteMapping("/{ticketNo}")
    public ResponseEntity<?> deleteTicket(@PathVariable Long ticketNo) {
        ticketService.deleteTicket(ticketNo);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
    @PutMapping("/{ticketNo}")
    public Ticket updateTicket(@RequestBody Ticket ticket, @PathVariable Long ticketNo){
        return ticketService.updateTicket(ticket, ticketNo);
    }

}