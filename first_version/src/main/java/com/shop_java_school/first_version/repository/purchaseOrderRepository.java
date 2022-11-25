package com.shop_java_school.first_version.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shop_java_school.first_version.controller.entity.Purchase_order;

@Repository
public interface purchaseOrderRepository extends CrudRepository<Purchase_order,Integer>{

}
