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

    @RequestMapping(value = "/customers")

    public class CustomerController {

            @Autowired
            private CustomerService customerService;

            @GetMapping("/{customerId}")
            public List<Customer> getCustomer(@PathVariable Long customerId) {
                return customerService.getAllCustomer(customerId);

            }
            @GetMapping("/")
            public  List<Customer> getAllCustomer(){
                return customerService.getCustomer();

            }

            @PostMapping
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



