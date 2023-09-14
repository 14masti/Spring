package com.masti.health.HealthManagment.dao;

import java.util.List;

import javax.sql.DataSource;
import com.masti.health.HealthManagment.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.masti.health.HealthManagment.model.InsurancePackages;
import com.masti.health.HealthManagment.model.NetworkHospitals;


@Component
public class HealthDAO implements HealthIntDAO {
	
	JdbcTemplate jdbcTemplate;
	@Autowired
	public void HealthDetailsDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	private final String SQL_ALLNETWORKS = "select * from masti_NetworkHospitals";
	private final String SQL_INSERT_ALLNETWORKS= "INSERT INTO masti_NetworkHospitals (hosp_id,hosp_title, hosp_location, hosp_address, hosp_contactmobile, hosp_contactphone, hosp_pincode, hosp_luudate, hosp_luuser)\r\n"
			+ "VALUES (?, ?, ?, ?, ?,?,?,?,?)";
	
	private final String SQL_ALLINSPPACK = "select * from masti_InsurancePackages";
//	private final String SQL_DOCTOR_SCHEDULE = "select * from appointmentsslotcalendar where slotdoctorid = ?";
//
//	private final String SQL_INSERT_PATIENTDETAILS = "INSERT INTO patients_venu (patientid, patientname, patientage, patientgender, patientmobile)VALUES (?, ?, ?, ?, ?)";



	@Override
	public List<NetworkHospitals> getAllNetHosp() {
		
		return jdbcTemplate.query(SQL_ALLNETWORKS, new HealthMapper());
	}
	
	
	@Override
	public boolean InsertNetworkHosp(NetworkHospitals n) {
		return jdbcTemplate.update(SQL_INSERT_ALLNETWORKS,n.getHospId(),
	            n.getHospTitle(),
	            n.getHospLocation(),
	            n.getHospAddress(),
	            n.getHospContactMobile(),
	            n.getHospContactPhone(),
	            n.getHospPincode(),
	            n.getHospLuudate(),
	            n.getHospLuuser()) > 0;
	}
	
	
	@Override
	public List<InsurancePackages> getAllInsurPack() {
		
		return jdbcTemplate.query(SQL_ALLINSPPACK, new InsurancePackageMapper());
	}

}






