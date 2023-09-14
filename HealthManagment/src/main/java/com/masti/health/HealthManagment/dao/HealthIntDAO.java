package com.masti.health.HealthManagment.dao;

import java.util.List;

import com.masti.health.HealthManagment.model.InsurancePackages;
import com.masti.health.HealthManagment.model.NetworkHospitals;




public interface HealthIntDAO {
	public List<NetworkHospitals> getAllNetHosp();

	public List<InsurancePackages> getAllInsurPack();


	public boolean InsertNetworkHosp(NetworkHospitals n);

	
}
