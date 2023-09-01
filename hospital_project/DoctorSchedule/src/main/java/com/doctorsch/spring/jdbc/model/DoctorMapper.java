package com.doctorsch.spring.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper; 

public class DoctorMapper implements RowMapper<DoctorsList> {
	
	public DoctorsList mapRow(ResultSet resultSet, int i) throws SQLException {

		DoctorsList doc = new DoctorsList();
		doc.setDoctorID(resultSet.getInt("doctorid"));
		doc.setFullname(resultSet.getString("fullname"));
		doc.setSpecID(resultSet.getInt("specializationid"));
		doc.setQualification(resultSet.getString("qualification"));
		doc.setExperience(resultSet.getInt("experience"));
		doc.setDesignation(resultSet.getString("designation"));
		doc.setPhoto(resultSet.getString("photo"));
		return doc;
	}

}






