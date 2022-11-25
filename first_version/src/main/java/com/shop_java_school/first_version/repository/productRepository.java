package com.shop_java_school.first_version.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shop_java_school.first_version.controller.entity.Product;

@Repository
public interface productRepository extends CrudRepository<Product,Integer>{

}
