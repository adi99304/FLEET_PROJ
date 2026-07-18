package com.fleetmanagement.demo.controller;

import com.fleetmanagement.demo.model.Shipment;
import com.fleetmanagement.demo.service.shipmentservice;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:5173/")
public class shipmentcontroller {
    @Autowired
    public shipmentservice shipser;
    @GetMapping("/shipments")
    public List<Shipment> getshipmentc(){
        return shipser.getshipments();
    }
    @GetMapping("/shipment/{id}")
    public Shipment getshipmentbyidc(@PathVariable Long id){

        return shipser.getshipmentbyids(id);
    }
    @PostMapping("/addshipment")
    public void addshipmentc(@RequestBody Shipment shipment){
        shipser.addshipments(shipment);

    }
    @PutMapping("/updateshipment")
    public void updateshipmentc(@RequestBody Shipment shipment){
        shipser.updateshipments(shipment);
    }
    @DeleteMapping("/deleteshipment/{id}")
    public void deleteshipmentc(@PathVariable Long id){
        shipser.deleteshipments(id);
    }
}
