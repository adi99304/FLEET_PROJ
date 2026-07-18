package com.fleetmanagement.demo.controller;

import com.fleetmanagement.demo.model.Warehouse;
import com.fleetmanagement.demo.service.warehouseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:5173")
public class warehousecontroller {
    @Autowired
    private warehouseservice wareser;
    @GetMapping("/warehouses")
    public List<Warehouse> getwarehouses(){
        return wareser.getwarehouse();
    }
    @GetMapping("/warehouses/{id}")
    public Warehouse getwarehousebyid(@PathVariable Long id){
        return wareser.getwarehousebyids(id);

    }
    @PostMapping("/addwarehouse")
    public void addwarehouse(@RequestBody Warehouse warehouse){
        wareser.addwarehouse(warehouse);
    }
    @PutMapping("/updatewarehouse")
    public void updatewarehouse(@RequestBody Warehouse warehouse){
        wareser.updatewarehouses(warehouse);
    }
    @DeleteMapping("/deletewarehouse/{id}")
    public void deletewarehousec(@PathVariable Long id){
        wareser.deletewarehouses(id);
    }

}
