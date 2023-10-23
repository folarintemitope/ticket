package com.example.Ticket.Controller;

    import com.example.Ticket.Service.CustomerService;;
import com.example.Ticket.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(value = "/customer")

    public class CustomerController {

            @Autowired
            private CustomerService customerService;

            @GetMapping("/create_Customer")
            public List<Customer> getAllCustomer(@PathVariable String customerId) {
                return customerService.getAllCustomer(customerId);
            }

            @PostMapping("/save_Customer")
            public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
                customerService.saveCustomer(customer);
                return new ResponseEntity<>(HttpStatus.CREATED);
            }
            @DeleteMapping("/{customerId}")
            public ResponseEntity deleteCustomer(@PathVariable String customerId) {
               customerService.deleteCustomer(customerId);
               return new ResponseEntity<>(HttpStatus.GONE);
            }
        }



