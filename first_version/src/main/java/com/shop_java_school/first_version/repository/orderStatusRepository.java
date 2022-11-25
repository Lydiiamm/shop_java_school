package com.shop_java_school.first_version.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shop_java_school.first_version.controller.entity.Order_status;

@Repository
public interface orderStatusRepository extends CrudRepository<Order_status,Integer>{

}
