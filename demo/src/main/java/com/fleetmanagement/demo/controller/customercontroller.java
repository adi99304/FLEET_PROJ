package com.fleetmanagement.demo.controller;

import com.fleetmanagement.demo.model.Customer;
import com.fleetmanagement.demo.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class customercontroller {
    @Autowired
    private customerservice custser;
    @GetMapping("/customers")
    public List<Customer> getallcustomerc(){
        return custser.getallcustomers();
    }
    @PostMapping("/addcustomer")
    public void addcustomerc(@RequestBody Customer customer){
       custser.addcustomer(customer);
    }
    @GetMapping("/customer/{id}")
    public Customer getcustbyidc(@PathVariable Long id){
        return custser.getcustbyid(id);
    }
    @PutMapping("/updatecustomer/{id}")
    public void updatecustomerc(@RequestBody Customer customer ,@PathVariable Long id){
        custser.updatecustomer(customer,id);
    }

}
