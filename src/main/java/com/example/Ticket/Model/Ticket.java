package com.example.Ticket.Model;

    import javax.persistence.*;

@Entity
    public class Ticket{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long ticketNo;
        private String DriverName;
        private String DriverId;
        private String vehicleName;
        private String ffromCity;
        private String toCity;
        private String seatingCapacity;
        private String travellerNo;
        private String availability;
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Customer customer;

    public Ticket(String driverName,
                  String driverId,
                  String vehicleName,
                  String ffromCity,
                  String toCity,
                  String seatingCapacity,
                  String travellerNo,
                  String availability){
//                  Customer customer) {
        DriverName = driverName;
        DriverId = driverId;
        this.vehicleName = vehicleName;
        this.ffromCity = ffromCity;
        this.toCity = toCity;
        this.seatingCapacity = seatingCapacity;
        this.travellerNo = travellerNo;
        this.availability = availability;
//        this.customer = customer;
    }

    public Long getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(Long ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getDriverId() {
        return DriverId;
    }

    public void setDriverId(String driverId) {
        DriverId = driverId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getFfromCity() {
        return ffromCity;
    }

    public void setFfromCity(String ffromCity) {
        this.ffromCity = ffromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getTravellerNo() {
        return travellerNo;
    }

    public void setTravellerNo(String travellerNo) {
        this.travellerNo = travellerNo;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public Ticket() {
    }

}


