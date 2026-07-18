package com.fleetmanagement.demo.service;


import com.fleetmanagement.demo.model.Warehouse;
import com.fleetmanagement.demo.repository.warehouserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class warehouseservice {
    @Autowired
    private warehouserepo warerep;
    public List<Warehouse> getwarehouse(){
        return warerep.findAll();
    }
    public void addwarehouse(Warehouse warehouse) {
        warerep.save(warehouse);
    }

    public Warehouse getwarehousebyids(Long id) {
        return warerep.findById(id).orElseThrow();
    }

    public void updatewarehouses(Warehouse warehouse) {
        Warehouse oldware = warerep.findById(warehouse.getWarehouseId()).orElseThrow();
        if (warehouse.getWarehouseName() != null) {
            oldware.setWarehouseName(warehouse.getWarehouseName());
        }
        if (warehouse.getAddress() != null) {
            oldware.setAddress(warehouse.getAddress());
        }
        if (warehouse.getSpaceAvailable() >0) {
            oldware.setSpaceAvailable(warehouse.getSpaceAvailable());
        }
        if (warehouse.getCity() != null) {
            oldware.setCity(warehouse.getCity());
        }
        if (warehouse.getState() != null) {
            oldware.setState(warehouse.getState());
        }
        warerep.save(oldware);
    }

    public void deletewarehouses(Long id) {
        warerep.deleteById(id );
    }
}
