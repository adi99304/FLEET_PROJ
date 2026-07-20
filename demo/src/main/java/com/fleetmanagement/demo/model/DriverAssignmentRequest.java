package com.fleetmanagement.demo.model;


import lombok.Data;

@Data
public class DriverAssignmentRequest {
    private Long vehicleId;
    private Long driverId;
}
