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
    public List<Customer> getAllCustomer;
    @Autowired
    TicketRepo ticketRepo;
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomer() {

        return customerRepository.findAll();
    }

    public Customer getCustomerById(String customerId) {
        return customerRepository.findById(customerId).get();

    }
    public Customer saveCustomer(Customer customer) {
        System.out.println("Size: "+customer.getTicketList().size());
        for (Ticket ticket: customer.getTicketList()){
            System.out.println(ticket.getDriverId());
            ticketRepo.save(ticket);
        }
//        List<Todo> todos = todoRepository.saveAll(user.getTodos());
//        user.setTodos(todos);
        Customer saveUser = customerRepository.save(customer);

        return saveUser;
    }

    public void deleteUSer(String customerId) {
        customerRepository.deleteById(customerId);
    }

    public Customer updateCustomer(Customer customer) {
        String customerId = customer.getCustomerId();
        Customer updated = customerRepository.findById(customerId).get();
        updated.setCustomerName(customer.getCustomerName());
        updated.setAddress(customer.getAddress());
        updated.setPhoneNo(customer.getPhoneNo());
        return customerRepository.save(updated);
    }

    public Customer deleteCustomer(String customerId) {
        return null;
    }
}
