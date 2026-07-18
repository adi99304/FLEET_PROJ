package com.fleetmanagement.demo.service;


import com.fleetmanagement.demo.model.Driver;
import com.fleetmanagement.demo.repository.driverrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class driverservice {
    @Autowired
    public driverrepo drirepo;


    public List<Driver> getdrivers() {
       return drirepo.findAll();
    }

    public Driver getdriverbyids(Long id) {
        return drirepo.findById(id).orElseThrow();
    }

    public void adddrivers(Driver driver) {
        drirepo.save(driver);
    }

    public void updatedrivers(Driver newdriver) {
        if (newdriver.getDriverid() == null) {
            throw new IllegalArgumentException("Driver ID cannot be null");
        }
        Driver oldriver = drirepo.findById(newdriver.getDriverid()).orElseThrow();
        if (newdriver.getDriverName() != null) {
            oldriver.setDriverName(newdriver.getDriverName());
        }
        if (newdriver.getDriverPhone() != null) {
            oldriver.setDriverPhone(newdriver.getDriverPhone());
        }
        if (newdriver.getDriverAddress() != null) {
            oldriver.setDriverAddress(newdriver.getDriverAddress());
        }
        if (newdriver.getDriavailable() != null) {
            oldriver.setDriavailable(newdriver.getDriavailable());
        }
        drirepo.save(oldriver);
    }

    public void deletedrivers(Long id) {
        drirepo.deleteById(id);
    }


}
