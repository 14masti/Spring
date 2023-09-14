package com.masti.health.HealthManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masti.health.HealthManagment.model.InsurancePackages;
import com.masti.health.HealthManagment.model.NetworkHospitals;
import com.masti.health.HealthManagment.repository.HealthRepository;



@RestController
public class HealthController {
	@Autowired
	HealthRepository healthres;
	
	@GetMapping(value = "/hospitals")  
	public List<NetworkHospitals> getAll(){  
	 
		List<NetworkHospitals> emps = healthres.getAlldata(); 
		return emps;  
	} 
	
	@GetMapping(value = "/Inspack")  
	public List<InsurancePackages> getInscpack(){  
	 
		List<InsurancePackages> emps = healthres.getInscpack(); 
		return emps;  
	} 
	
	@RequestMapping(value = "/hospitals", method = RequestMethod.POST)
	   public ResponseEntity<Object> createEmployee(@RequestBody NetworkHospitals insthosp) {
		 
		healthres.Insertdata(insthosp);
	      return new ResponseEntity<>("Hospital is created successfully", HttpStatus.CREATED);
	   }
}