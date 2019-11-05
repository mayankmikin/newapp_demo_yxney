package com.yxneymaritime.newapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yxneymaritime.newapp.model.City;


@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	

}
