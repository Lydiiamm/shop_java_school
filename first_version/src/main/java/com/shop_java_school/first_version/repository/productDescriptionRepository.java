package com.shop_java_school.first_version.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shop_java_school.first_version.controller.entity.Product_description;

@Repository
public interface productDescriptionRepository extends CrudRepository<Product_description,Integer>{

}
