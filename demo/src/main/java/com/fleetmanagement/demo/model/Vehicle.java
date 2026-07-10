package com.fleetmanagement.demo.model;


import com.fleetmanagement.demo.enums.Vehicleavailable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleid;
    @Enumerated(EnumType.STRING)
    private Vehicleavailable vehavailable;
    private String vehiclename;
    private double capacity;
}
