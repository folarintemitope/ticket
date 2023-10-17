package com.example.Ticket.Controller;

    import com.example.Ticket.Service.CustomerService;
import com.example.Ticket.Service.TicketService;
import com.example.Ticket.Model.Customer;
import com.example.Ticket.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path="/customer")

    public class CustomerController {
        @Autowired
        private CustomerService customerService;
        @GetMapping
        public List<Customer> getAllCustomer(){
            return (List<Customer>) customerService.getCustomer("");
        }

        @PostMapping
        public Customer saveCustomer(@RequestBody Customer customer) {
            Customer customer1= customerService.saveCustomer(customer);
            return customer1;
        }

    }


