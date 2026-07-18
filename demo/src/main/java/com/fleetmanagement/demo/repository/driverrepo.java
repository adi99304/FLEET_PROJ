package com.fleetmanagement.demo.repository;

import com.fleetmanagement.demo.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface driverrepo extends JpaRepository<Driver,Long> {
}
