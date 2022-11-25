package com.shop_java_school.first_version.service;

import com.shop_java_school.first_version.controller.entity.Customer;
import com.shop_java_school.first_version.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerService {

    @Autowired
    private customerRepository customerRepository;

    public Customer save(Customer customer){
        Customer newCustomer = customerRepository.save(customer);
        return newCustomer;
    }

}