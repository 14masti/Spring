package com.doctorsch.spring.jdbc.dao;

import java.util.List;

import com.doctorsch.spring.jdbc.model.*;



public interface DoctorDAO {

	boolean createDoctorSchedule(Doctor d);

	List<DoctorsList> getAllDoctorList();

	DoctorsList getDoctorById(int doctorId);

}
