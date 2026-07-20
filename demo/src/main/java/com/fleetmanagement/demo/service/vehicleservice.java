package com.fleetmanagement.demo.service;


import com.fleetmanagement.demo.enums.driveravailable;
import com.fleetmanagement.demo.model.Driver;
import com.fleetmanagement.demo.model.DriverAssignmentRequest;
import com.fleetmanagement.demo.model.Vehicle;
import com.fleetmanagement.demo.repository.driverrepo;
import com.fleetmanagement.demo.repository.vehiclerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicleservice {
    @Autowired
    public vehiclerepo vehrepo;
    @Autowired
    public driverrepo drirepo;
    public List<Vehicle> getvehicles(){
        return vehrepo.findAll();
    }

    public void addvehicles(Vehicle vehicle) {
        vehrepo.save(vehicle);
    }

    public Vehicle getvehiclebyids(Long id) {
        return vehrepo.findById(id).orElseThrow();
    }

    public void updatevehicles(Vehicle newvehicle) {
        Vehicle oldvehicle= vehrepo.getById(newvehicle.getVehicleid());
        if(oldvehicle.getCapacity()>0){
    oldvehicle.setCapacity(newvehicle.getCapacity());
        }
        if(oldvehicle.getVehavailable() != null){
            oldvehicle.setVehavailable((newvehicle.getVehavailable()));
        }
        vehrepo.save(oldvehicle);
    }

    public void deleteveh(Long id) {
        vehrepo.deleteById( id);
    }

    public void assigndrivers(DriverAssignmentRequest drirequest) {
        System.out.println("Vehicle ID: " + drirequest.getVehicleId());
        System.out.println("Driver ID: " + drirequest.getDriverId());

        Vehicle vehicle= vehrepo.findById(drirequest.getVehicleId()).orElseThrow();
        Driver driver= drirepo.findById(drirequest.getDriverId()).orElseThrow();
        driver.setDriavailable(driveravailable.not_available);
        drirepo.save(driver);
        vehicle.setDriver(driver);
        vehrepo.save(vehicle);
    }

    public void removedrivers(Long vehid) {
        Vehicle vehicle= vehrepo.findById(vehid).orElseThrow();
        Driver driver=vehicle.getDriver();
        driver.setDriavailable(driveravailable.available);
        drirepo.save(driver);
        vehicle.setDriver(null);
        vehrepo.save(vehicle);
    }
}
