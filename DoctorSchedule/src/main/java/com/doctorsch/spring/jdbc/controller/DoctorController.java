package com.doctorsch.spring.jdbc.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctorsch.spring.jdbc.dal.CredentialsDAL;
import com.doctorsch.spring.jdbc.dao.DoctorDAO;
import com.doctorsch.spring.jdbc.model.Doctor;
import com.doctorsch.spring.jdbc.model.DoctorsList;


@Controller
public class DoctorController {
	DoctorDAO doctordao;
	CredentialsDAL c;

	@Autowired
	public DoctorController(DoctorDAO doctordao) {
		this.doctordao = doctordao;
	}
    
	@RequestMapping("/doctorview")
    public String viewDoctor(@RequestParam("doctorId") int doctorId, Model model) {
        DoctorsList doctor = doctordao.getDoctorById(doctorId); // Implement this method to retrieve a specific doctor by ID
        System.out.println(doctor);
        model.addAttribute("doctor", doctor);
        return "DoctorDetails"; // Return the view for displaying doctor details
    }
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String DoctorList(Model model) {
		List<DoctorsList> al=doctordao.getAllDoctorList();
		model.addAttribute("DoctorList", al);
		return "DocList";
	}

	@RequestMapping(value = "/raju", method = RequestMethod.POST)
	public String user(@ModelAttribute("doc") Doctor doc, Model model) {
		doctordao.createDoctorSchedule(doc);
		System.out.println("User Page Requested");
		model.addAttribute("empName", doc.getDoct_id());
		return "raju";
	}
	
	@RequestMapping(value = "/calendar", method = RequestMethod.POST)
	public String calendar(@ModelAttribute("doc") Doctor doc, Model model) {
		doctordao.createDoctorSchedule(doc);
		System.out.println("User Page Requested");
		model.addAttribute("empName", doc.getDoct_id());
		return "raju";
	}


}
