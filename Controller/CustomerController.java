package com.example.Ticket.Controller;

    import com.example.Ticket.Repository.CustomerRepository;
    import com.example.Ticket.Service.CustomerService;
import com.example.Ticket.Service.TicketService;
import com.example.Ticket.Model.Customer;
import com.example.Ticket.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(value = "/customer")

    public class CustomerController {

            @Autowired
            private CustomerService customerService;

            @GetMapping
            public List<Customer> getAllCustomer() {
                return customerService.getAllCustomer;
            }

            @PostMapping
            public Customer saveCustomer(@RequestBody Customer customer) {
                Customer customer1 = customerService.saveCustomer(customer);
                return customer1;
            }
            @DeleteMapping("/{id}")
            public Customer deleteUser(@PathVariable String customerId) {
               Customer delete = customerService.deleteCustomer(customerId);
               return delete;
            }

            @PutMapping
            public Customer updateCustomer(@RequestBody Customer customer) {
                Customer savedCustomer = customerService.updateCustomer(customer);
                return savedCustomer;
            }
        }



