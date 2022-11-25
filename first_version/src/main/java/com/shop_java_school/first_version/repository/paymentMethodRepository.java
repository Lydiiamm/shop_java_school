package com.shop_java_school.first_version.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shop_java_school.first_version.controller.entity.Payment_method;

@Repository
public interface paymentMethodRepository extends CrudRepository<Payment_method,Integer>{

}
