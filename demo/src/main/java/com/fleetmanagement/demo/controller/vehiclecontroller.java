package com.fleetmanagement.demo.controller;

import com.fleetmanagement.demo.model.DriverAssignmentRequest;
import com.fleetmanagement.demo.model.Vehicle;
import com.fleetmanagement.demo.service.vehicleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping("/api")
public class vehiclecontroller {
    @Autowired
    public vehicleservice vehser;
    @GetMapping("/vehicles")
    public List<Vehicle> getvehicles(){
        return vehser.getvehicles();
    }
    @GetMapping("/vehicles/{id}")
    public Vehicle getvehnyidc(@PathVariable Long id){
        return vehser.getvehiclebyids(id);
    }
    @PostMapping("addvehicle")
    public void addvehicle(@RequestBody Vehicle vehicle){
        vehser.addvehicles(vehicle);
    }
    @PutMapping("/updatevehicle")
    public void updatevehicle(@RequestBody Vehicle vehicle){
        vehser.updatevehicles(vehicle);
    }
    @DeleteMapping("deletevehicle/{id}")
    public void deleteveh(@PathVariable Long id ){
        vehser.deleteveh(id);
    }
    @PostMapping("/assigndriver")
    public void assigndriverc(@RequestBody DriverAssignmentRequest drirequest){
        vehser.assigndrivers(drirequest);
    }
    @PutMapping("/removedriver/{id}")
    public void removedriverc(@PathVariable("id") Long vehid){
        vehser.removedrivers(vehid);
    }

}
