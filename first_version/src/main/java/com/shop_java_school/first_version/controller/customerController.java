package com.shop_java_school.first_version.controller;

import com.shop_java_school.first_version.controller.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer") //http://localhost:8080/api/customer
public class customerController {

    //http://localhost:8080/api/customer
    @PostMapping
    public Customer addCustomer(){
        return null;
    }

    @PutMapping("/{customerId}") //http://localhost:8080/api/customer/10 PUT
    public Customer updateCustomer(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/customer GET
    public List<Customer> getAllCustomer(){
        return null;
    }

    @GetMapping ("/{customerId}") //http://localhost:8080/api/customer GET
    public Customer getCustomerById(){

        return null;
    }

    @DeleteMapping ("/{customerId}") //http://localhost:8080/api/customer DELETE
    public void deleteCustomer(){

    }
}
