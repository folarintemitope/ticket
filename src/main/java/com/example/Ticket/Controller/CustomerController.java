package com.example.Ticket.Controller;

    import com.example.Ticket.Service.CustomerService;;
import com.example.Ticket.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.repository.query.Param;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(value = "/customer")

    public class CustomerController {

            @Autowired
            private CustomerService customerService;

            @GetMapping("/create_customer/{customerId}")
            public List<Customer> getAllCustomer(@PathVariable Long customerId) {
                return customerService.getAllCustomer(customerId);
            }

            @PostMapping("/save_customer")
            public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
               Customer customerSaved =  customerService.saveCustomer(customer);
                return ResponseEntity.status(HttpStatus.CREATED).body(customerSaved);
            }
            @DeleteMapping("/{customerId}")
            public ResponseEntity<?> deleteCustomer(@PathVariable Long customerId) {
               customerService.deleteCustomer(customerId);
               return new ResponseEntity<>(HttpStatus.GONE);
            }

            @PutMapping("/{customerId}")
            public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long customerId){
               return customerService.updateCustomer(customer, customerId);
            }
    }



