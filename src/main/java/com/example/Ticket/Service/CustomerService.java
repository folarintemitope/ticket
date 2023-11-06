package com.example.Ticket.Service;

import com.example.Ticket.Model.Customer;
import com.example.Ticket.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
public class
CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> getAllCustomer(Long customerId) {
        if (null != customerId) {
            return customerRepository.findAllByCustomerId(customerId);
        } else {
            return customerRepository.findAll();
        }
    }
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
    public Customer updateCustomer(Customer customer, Long customerId){
        Customer customer6 = customerRepository.findById(customerId).orElseThrow(
                () -> new IllegalStateException("customer with id " + customerId + " does not exist")
        );

       return customerRepository.save(customer);
    }

}
