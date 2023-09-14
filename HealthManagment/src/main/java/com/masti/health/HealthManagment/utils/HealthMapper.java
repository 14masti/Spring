package com.masti.health.HealthManagment.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.masti.health.HealthManagment.model.NetworkHospitals;



public class HealthMapper implements RowMapper<NetworkHospitals>{

		public NetworkHospitals mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			NetworkHospitals net = new NetworkHospitals();
			net.setHospId(resultSet.getInt("hosp_Id"));
			net.setHospTitle(resultSet.getString("hosp_Title"));
			net.setHospLocation(resultSet.getString("hosp_Location"));
			net.setHospAddress(resultSet.getString("hosp_Address"));
			net.setHospContactMobile(resultSet.getString("hosp_ContactMobile"));
			net.setHospContactPhone(resultSet.getString("hosp_ContactPhone"));
			net.setHospPincode(resultSet.getString("hosp_Pincode"));
			net.setHospLuudate(resultSet.getDate("hosp_Luudate"));
			net.setHospLuuser(resultSet.getString("hosp_Luuser"));
			
			return net;
			
		}
}
