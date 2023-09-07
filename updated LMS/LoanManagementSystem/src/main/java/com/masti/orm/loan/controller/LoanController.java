package com.masti.orm.loan.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.masti.orm.loan.model.LoanInputApplication;
import com.masti.orm.loan.service.LoanService;


@Controller
public class LoanController {
	
	private LoanService loanser;
	private LoanInputApplication preobject;
	@Autowired
	public void LoanController(LoanService loanser)
	{
		this.loanser=loanser;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {	
		return "demo";
	}
	
	@RequestMapping(value = "/submitLoanApplication", method = RequestMethod.GET)
	public String LoanInput(@ModelAttribute("loanInputApplication") LoanInputApplication lnInput,Model model) {	
		preobject=lnInput;
		model.addAttribute("loanlist",lnInput);
		
		return "preview";
	}
	
	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    public String submitForm(Model model) {
		System.out.println(preobject);
		model.addAttribute("loanlist",preobject);
        return "demo";
    }
	
	@RequestMapping(value = "/saveform", method = RequestMethod.POST)
    public String SaveForm(Model model) {
		System.out.println(preobject);
		
		loanser.DataInsertion(preobject);
		model.addAttribute("serviceloan",preobject);
        return "approval";
    }
	
	
}