package com.fleetmanagement.demo.service;


import com.fleetmanagement.demo.enums.Shipmentstatus;
import com.fleetmanagement.demo.enums.Vehicleavailable;
import com.fleetmanagement.demo.enums.driveravailable;
import com.fleetmanagement.demo.model.*;
import com.fleetmanagement.demo.repository.*;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@Service
public class shipmentservice {
    @Autowired
    public shipmentrepo shiprepo;
    @Autowired
    public customerepo  custrepo;
    @Autowired
    public warehouserepo warerepo;
    @Autowired
    public driverrepo drirepo;
    @Autowired
    public vehiclerepo vehrepo;


    public List<Shipment> getshipments() {
        return shiprepo.findAll();
    }

    public Shipment getshipmentbyids(Long id) {
        return shiprepo.findById(id).orElseThrow();
    }

    private String generatetrackingnumber(){
        Random random= new Random();
        int number= random.nextInt(999999)+100000;
        LocalDate today= LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMdd");
        String date= today.format(formatter);
        return "TRK-"+date+"-"+number;

    }
    //warehouse assignment
    private Warehouse assignwarehouse(double shipcap){
        List<Warehouse> warehouseList=warerepo.findAll();
        for(int i =0;i<warehouseList.size();i++){

            if(warehouseList.get(i).getSpaceAvailable()>=shipcap){
                warehouseList.get(i).setSpaceAvailable(warehouseList.get(i).getSpaceAvailable()-shipcap);
                warerepo.save(warehouseList.get(i));
                return warehouseList.get(i);

            }
        }
        return null;
    }

    // vehicle assignment
    private Vehicle assignvehicle(double shipcap){
        List<Vehicle> vehiclelist= vehrepo.findAll();
        for(int i =0;i<vehiclelist.size();i++){
            if(vehiclelist.get(i).getVehavailable()== Vehicleavailable.available && vehiclelist.get(i).getCapacity()>=shipcap){
                vehiclelist.get(i).setVehavailable(Vehicleavailable.assigned);
                vehiclelist.get(i).setCapacity(vehiclelist.get(i).getCapacity()-shipcap);
                vehrepo.save(vehiclelist.get(i));
                return vehiclelist.get(i);
            }
        }
        throw new RuntimeException("No vehcile available");
    }
    // driver assignment
    private Driver assigndriver(){
        List<Driver> driverlist= drirepo.findAll();
        for(int i=0;i<driverlist.size();i++){
            if(driverlist.get(i).getDriavailable()== driveravailable.available){
                driverlist.get(i).setDriavailable(driveravailable.not_available);
                drirepo.save(driverlist.get(i));
                return driverlist.get(i);
            }
        }
        throw new RuntimeException("Suitable driver not found");
    }
    @Transactional
    public void addshipments(Shipment shipment) {

        if(shipment.getTrackingnumber()==null){
            shipment.setTrackingnumber(generatetrackingnumber());
        }
        Customer customer = custrepo.findById(shipment.getCustomer().getCustid()).orElseThrow();
        shipment.setCustomer(customer);
        shipment.setCreatedate(LocalDateTime.now());
        shipment.setWarehouse(assignwarehouse(shipment.getWeight()));
        shipment.setVehicle(assignvehicle(shipment.getWeight()));
        shipment.setDriver(assigndriver());
        shipment.setStatus(Shipmentstatus.CREATED);
//        Driver driver = drirepo.findById(shipment.getDriver().getDriverid()).orElseThrow();
//        shipment.setDriver(driver);
//        Warehouse warehouse=warerepo.findById(shipment.getWarehouse().getWarehouseId()).orElseThrow();
//        shipment.setWarehouse(warehouse);
//        Vehicle vehicle= vehrepo.findById(shipment.getVehicle().getVehicleid()).orElseThrow();
//        shipment.setVehicle(vehicle);
        shiprepo.save(shipment);

    }

    public void updateshipments(Shipment shipment) {

    }

    public void deleteshipments(Long id) {
        Shipment shipment=shiprepo.findById(id).orElseThrow();
       Driver driver =shipment.getDriver();
       driver.setDriavailable(driveravailable.available);
       drirepo.save(driver);
       Warehouse warehouse= shipment.getWarehouse();
       warehouse.setSpaceAvailable(warehouse.getSpaceAvailable()+shipment.getWeight());
       warerepo.save(warehouse);
       Vehicle vehicle = shipment.getVehicle();
       vehicle.setVehavailable(Vehicleavailable.available);
       vehicle.setCapacity(vehicle.getCapacity()+shipment.getWeight());
       vehrepo.save(vehicle);
        shiprepo.deleteById(id);
    }
}
