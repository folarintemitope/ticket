package com.example.Ticket.Repository;

import com.example.Ticket.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
   List<Customer> findAllByCustomerId(Long customerId);
}