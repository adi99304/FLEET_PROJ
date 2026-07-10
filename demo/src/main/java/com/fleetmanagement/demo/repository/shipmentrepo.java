package com.fleetmanagement.demo.repository;

import com.fleetmanagement.demo.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface shipmentrepo extends JpaRepository<Shipment,Long> {
}
