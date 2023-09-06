package com.masti.orm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.masti.orm.model.Employee;
import com.masti.orm.service.EmpService;



@Controller
public class EmpController {
	
	private EmpService empser;
    
	@Autowired
	public void EmpController(EmpService empser)
	{
		this.empser=empser;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home( Model model) {	
		model.addAttribute("emplist",empser.ListAll());
		return "AddEmp";
	}
	
	@RequestMapping(value = "/added", method = RequestMethod.POST)
	public String saveNewEmployee(@Validated Employee emp, Model model) {
		System.out.println("Save New Employee Page Requested");
		// get all employees from DAO
		empser.add(emp);

		// set it to the model
		model.addAttribute("emp", emp);

		return "Empdisp";
}
}


