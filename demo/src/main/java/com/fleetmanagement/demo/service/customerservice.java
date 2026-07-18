package com.fleetmanagement.demo.service;

import com.fleetmanagement.demo.model.Customer;
import com.fleetmanagement.demo.repository.customerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerservice {
    @Autowired
    private customerepo custrepo;
    public List<Customer>  getallcustomers(){
        return custrepo.findAll();
    }
    public void addcustomer(Customer customer){
        custrepo.save(customer);
    }
    public Customer getcustbyid(Long id){
       return custrepo.findById(id).orElseThrow();
    }
    public void updatecustomer(Customer customer ,Long id) {
        Customer oldcust = custrepo.findById(id).orElseThrow();
        if (customer.getCustomerName() != null) {
            oldcust.setCustomerName(customer.getCustomerName());
        }
        if (customer.getCustomerAddress() != null) {
            oldcust.setCustomerAddress(customer.getCustomerAddress());
        }
        if (customer.getEmail() != null) {
            oldcust.setEmail(customer.getEmail());
        }
        if (customer.getCity() != null) {
            oldcust.setCity(customer.getCity());
        }
        if (customer.getPhone() != null) {
            oldcust.setPhone(customer.getPhone());
        }
        if (customer.getState() != null) {
            oldcust.setState(customer.getState());
        }
        custrepo.save(oldcust);
    }
    public void deletecustomer( long id ){
        custrepo.deleteById(id);

    }



}
