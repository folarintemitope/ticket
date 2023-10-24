package com.example.Ticket.Repository;

import com.example.Ticket.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Long>{
    List<Ticket> findAllByTicketNo(Long ticketNo);
}
