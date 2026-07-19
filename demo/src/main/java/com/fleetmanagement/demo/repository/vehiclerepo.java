package com.fleetmanagement.demo.repository;

import com.fleetmanagement.demo.enums.Vehicleavailable;
import com.fleetmanagement.demo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehiclerepo extends JpaRepository<Vehicle,Long> {
    long countByVehavailable(Vehicleavailable vehicleavailable);
}
