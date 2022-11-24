package com.shop_java_school.first_version.controller;

import com.shop_java_school.first_version.entity.customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer") //http://localhost:8080/api/customer
public class customerController {

    //http://localhost:8080/api/customer
    @PostMapping
    public customer addCustomer(){
        return null;
    }

    @PutMapping("/{customerId}") //http://localhost:8080/api/customer/10 PUT
    public customer updateCustomer(){
        return null;
    }

    @GetMapping //http://localhost:8080/api/customer GET
    public List<customer> getAllCustomer(){
        return null;
    }

    @GetMapping ("/{customerId}") //http://localhost:8080/api/customer GET
    public customer getCustomerById(){

        return null;
    }

    @DeleteMapping ("/{customerId}") //http://localhost:8080/api/customer DELETE
    public void deleteCustomer(){

    }
}
