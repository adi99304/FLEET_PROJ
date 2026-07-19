package com.fleetmanagement.demo.model;
import lombok.Data;



@Data

public class Dashboard {
    private long totalCustomers;
    private long totalDrivers;
    private long availableDrivers;
    private long assignedDrivers;

    private long totalVehicles;
    private long availableVehicles;

//    private long totalShipments;
    private long createdShipments;
    private long inTransitShipments;
    private long deliveredShipments;

    private double warehouseUtilization;
    private double warepercentutilization;
}
