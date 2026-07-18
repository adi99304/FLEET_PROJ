package com.fleetmanagement.demo.controller;


import com.fleetmanagement.demo.model.Driver;
import com.fleetmanagement.demo.service.driverservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class drivercontroller {
    @Autowired
    public driverservice driser;

    @GetMapping("/drivers")
    public List<Driver> getdriverc(){
        return driser.getdrivers();
    }
    @GetMapping("/drivers/{id}")
    public Driver getdriverbyid(@PathVariable Long id ){
        return driser.getdriverbyids(id);
    }
    @PostMapping("/adddrivers")
    public void adddriverc(@RequestBody Driver driver){
         driser.adddrivers(driver);
    }
    @PutMapping("/updatedrivers")
    public void updatedriverc(@RequestBody Driver driver){
        driser.updatedrivers(driver);
    }
    @DeleteMapping("/deletedriver/{id}")
    public void deletedriver(@PathVariable Long id){
        driser.deletedrivers(id);
    }

}
