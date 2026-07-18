package com.fleetmanagement.demo.model;

import com.fleetmanagement.demo.enums.driveravailable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverid;

    private String driverName;
    private String driverPhone;
    private String driverAddress;
    @Enumerated(EnumType.STRING)
    private driveravailable driavailable;
}
