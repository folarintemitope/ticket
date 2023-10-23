package com.example.Ticket.Service;

import com.example.Ticket.Model.Customer;
import com.example.Ticket.Model.Ticket;
import com.example.Ticket.Repository.CustomerRepository;
import com.example.Ticket.Repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(String customerId) {
        if (null != customerId) {
            return customerRepository.findAllById(customerId);
        } else {
            return customerRepository.findAll();
        }
    }
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }


}
