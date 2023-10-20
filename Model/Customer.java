package com.example.Ticket.Model;

    import javax.persistence.*;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.criteria.Fetch;
    import java.util.ArrayList;
    import java.util.List;

    @Entity
    public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)


        private String customerId;
        private String customerName;
        private String address;
        private String phoneNo;
        @OneToMany(cascade = CascadeType.ALL)
        private List<Ticket> ticketList  =new ArrayList<>();


        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String id) {
            this.customerId = customerId;
        }

        public Customer(String id) {
            this.customerId = customerId;
        }



        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public List<Ticket> getTicketList() {
            return ticketList;
        }

        public void setTicketList(List<Ticket> ticketList) {
            this.ticketList = ticketList;
        }

        public Customer(String customerName, String address, String phoneNo, List<Ticket> ticketList) {
            this.customerName = customerName;
            this.address = address;
            this.phoneNo = phoneNo;
            this.ticketList = ticketList;
        }

        public Customer() {
        }

    }



