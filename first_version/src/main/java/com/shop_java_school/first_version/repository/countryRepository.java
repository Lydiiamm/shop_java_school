package com.shop_java_school.first_version.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shop_java_school.first_version.controller.entity.Country;

@Repository
public interface countryRepository extends CrudRepository<Country,Integer>{

}
