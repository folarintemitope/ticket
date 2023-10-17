package com.example.Ticket.Service;

import com.example.Ticket.Repository.CustomerRepository;
import com.example.Ticket.Repository.TicketRepo;
import com.example.Ticket.Model.Customer;
import com.example.Ticket.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
    public class CustomerService {
        @Autowired
        TicketRepo ticketRepo;
        @Autowired
        CustomerRepository customerRepository;

        //    public List<Customer> getAllCustomer() {
//        Ticket driverName = new Ticket();
//        return (List<Customer>) driverName;
//    }
        public List<Customer> getAllUser() {

            return customerRepository.findAll();
        }

        public Customer getCustomer(String customer) {
            return customerRepository.findById(customer).get();

        }

        public Customer saveCustomer(Customer customer) {
            System.out.println("Size: " + customer.getTicketList().size());
            for (Ticket ticket : customer.getTicketList()) {
                System.out.println(ticket.getAvailability());
                ticketRepo.save(ticket);

            }
//        List<Todo> todos = todoRepository.saveAll(user.getTodos());
////        user.setTodos(todos);
//        User saveUser = userRepository.save(user);
//
//        return saveUser;
//    }
            Customer saveCustomer = customerRepository.save(customer);
            return saveCustomer;
        }

}
