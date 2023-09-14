package com.masti.health.HealthManagment.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.masti.health.HealthManagment.dao.HealthIntDAO;
import com.masti.health.HealthManagment.model.InsurancePackages;
import com.masti.health.HealthManagment.model.NetworkHospitals;


@Repository
public class HealthRepository{

	@Autowired
	private HealthIntDAO healthdao;
	
	public List<NetworkHospitals> getAlldata(){
		List<NetworkHospitals> l1= healthdao.getAllNetHosp();
		return l1;
	}
	
	public List<InsurancePackages> getInscpack(){
		List<InsurancePackages> l2= healthdao.getAllInsurPack();
		return l2;
	}
	
	
	public boolean Insertdata(NetworkHospitals n) {
		return healthdao.InsertNetworkHosp(n);
	}


}
