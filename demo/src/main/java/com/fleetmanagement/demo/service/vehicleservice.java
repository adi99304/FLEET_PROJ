package com.fleetmanagement.demo.service;


import com.fleetmanagement.demo.model.Vehicle;
import com.fleetmanagement.demo.repository.vehiclerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicleservice {
    @Autowired
    public vehiclerepo vehrepo;
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
}
