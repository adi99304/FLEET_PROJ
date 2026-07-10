package com.fleetmanagement.demo.repository;

import com.fleetmanagement.demo.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface warehouserepo extends JpaRepository<Warehouse,Long> {
}
