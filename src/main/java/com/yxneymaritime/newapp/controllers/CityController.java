package com.yxneymaritime.newapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yxneymaritime.newapp.model.City;
import com.yxneymaritime.newapp.service.ICityService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j	
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CityController {
	   @Autowired
	    private ICityService cityService;
	   
	@GetMapping("/showCities")
	public List<City> findAll() {
		log.info("findAll");
		return (List<City>) cityService.findAll();
	}
	
}
