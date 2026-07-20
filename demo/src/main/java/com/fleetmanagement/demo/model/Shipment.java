package com.fleetmanagement.demo.model;

import com.fleetmanagement.demo.enums.Shipmentstatus;
import jakarta.persistence.*;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAlias;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Data
public class Shipment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long shipid;

    @JsonProperty("ReceiverName")
    @JsonAlias({"receiverName", "RecieverName", "recieverName"})
    private String ReceiverName;

    @JsonProperty("ReceiverAddress")
    @JsonAlias({"receiverAddress", "RecieverAddress", "recieverAddress"})
    private String ReceiverAddress;

    private String trackingnumber;
    @ManyToOne
    @JoinColumn(name="custid")
    private Customer customer;
    @Enumerated(EnumType.STRING)
    private Shipmentstatus status;
    private double weight;
    private LocalDateTime createdate;
    private LocalDate estimateddelivery;
    @ManyToOne
    @JoinColumn(name = "wareid")
    private Warehouse warehouse;
//    @ManyToOne
//    @JoinColumn(name="driverid")
//    private Driver driver;
    @ManyToOne
    @JoinColumn(name="vehicleid")
    private Vehicle vehicle;




}
