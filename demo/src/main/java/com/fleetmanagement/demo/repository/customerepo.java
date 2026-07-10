package com.fleetmanagement.demo.repository;

import com.fleetmanagement.demo.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface customerepo extends JpaRepository<Customer,Long> {
}
