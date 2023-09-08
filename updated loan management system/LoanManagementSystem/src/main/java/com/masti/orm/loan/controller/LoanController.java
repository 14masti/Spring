package com.masti.orm.loan.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.masti.orm.loan.model.LoanInputApplication;
import com.masti.orm.loan.model.User;
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
		return "login";
	}
	
	@RequestMapping(value = "/registerbutton", method = RequestMethod.POST)
	public String register() {	
		return "register";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String registersucess(@ModelAttribute("User") User us1,Model model) {
		loanser.RegisterData(us1);
			System.out.println(us1);

		return "login";
	}
	
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String logindata(@ModelAttribute("User") User us,Model model){
		if(loanser.checkCredentials(us)) {
			return "demo";}
		else {
			return "login";
		}
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
	
	@RequestMapping("/get-user-agent")
    public String getUserAgent(@RequestHeader("Host") String userAgent) {
		System.out.println(userAgent);
        return "User-Agent: " + userAgent;
    }
	
}