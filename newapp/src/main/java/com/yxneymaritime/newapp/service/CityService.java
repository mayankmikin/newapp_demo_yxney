package com.yxneymaritime.newapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxneymaritime.newapp.model.City;
import com.yxneymaritime.newapp.repository.CityRepository;

@Service
public class CityService implements ICityService {

	 @Autowired
	    private CityRepository repository;

	    @Override
	    public List<City> findAll() {

	    	List<City> cities = (List<City>) repository.findAll();

	        return cities;
	    }
	
}
