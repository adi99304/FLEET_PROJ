package com.fleetmanagement.demo.controller;


import com.fleetmanagement.demo.model.Dashboard;
import com.fleetmanagement.demo.service.dashboardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:5173")
public class dashboardcontroller {
    @Autowired
    public dashboardservice dasher;
    @GetMapping("/getdashboard")
    public Dashboard getdashc(){
        return dasher.getdashboard();
    }

}
