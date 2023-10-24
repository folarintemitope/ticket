package com.example.Ticket.Service;

import com.example.Ticket.Model.Customer;
import com.example.Ticket.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(Long customerId) {
        if (null != customerId) {
            return customerRepository.findAllByCustomerId(customerId);
        } else {
            return customerRepository.findAll();
        }
    }
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }


}
