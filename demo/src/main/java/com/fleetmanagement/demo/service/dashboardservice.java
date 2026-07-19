package com.fleetmanagement.demo.service;

import com.fleetmanagement.demo.enums.Shipmentstatus;
import com.fleetmanagement.demo.enums.Vehicleavailable;
import com.fleetmanagement.demo.enums.driveravailable;
import com.fleetmanagement.demo.model.Dashboard;
import com.fleetmanagement.demo.model.Warehouse;
import com.fleetmanagement.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dashboardservice {
    @Autowired
    private customerepo custrepo;
    @Autowired
    private driverrepo drirepo;
    @Autowired
    private shipmentrepo shiprepo;
    @Autowired
    private warehouserepo warerepo;
    @Autowired
    private vehiclerepo vehrepo;
    private double warehouseuitilization;
    public Dashboard getdashboard(){
        Dashboard dash = new Dashboard();
        dash.setTotalCustomers(custrepo.count());
        dash.setTotalDrivers(drirepo.count());
        dash.setAvailableDrivers(drirepo.countByDriavailable(driveravailable.available));
        dash.setAssignedDrivers(drirepo.countByDriavailable(driveravailable.not_available));
        dash.setTotalVehicles(vehrepo.count());
        dash.setAvailableVehicles(vehrepo.countByVehavailable(Vehicleavailable.available));
        dash.setCreatedShipments(shiprepo.count());
        dash.setInTransitShipments(shiprepo.countByStatus(Shipmentstatus.IN_TRANSIT));
        dash.setDeliveredShipments(shiprepo.countByStatus(Shipmentstatus.DELIVERED));

        List<Warehouse> warelist= warerepo.findAll();
        double totalcapacity=0;
        totalcapacity= 1000* warerepo.count();
        double spaceavailable=0;
        for(Warehouse warehouse: warelist){

            spaceavailable+= warehouse.getSpaceAvailable();
        }
        double utilization= totalcapacity-spaceavailable;
        double percentutilization= (utilization/totalcapacity) *100;
        dash.setWarehouseUtilization(utilization);
        dash.setWarepercentutilization(percentutilization);
        return dash;
    }
}
