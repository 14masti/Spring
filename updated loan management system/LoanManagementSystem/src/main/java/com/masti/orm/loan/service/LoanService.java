package com.masti.orm.loan.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masti.orm.loan.dao.LoanDAO;
import com.masti.orm.loan.model.Customers;
import com.masti.orm.loan.model.LoanApplicantNominees;
import com.masti.orm.loan.model.LoanApplicants;
import com.masti.orm.loan.model.LoanInputApplication;
import com.masti.orm.loan.model.User;



@Service
public class LoanService {
	
	@Autowired
	private LoanDAO loandao;
	
	@Transactional
	public void add(LoanInputApplication la) {
		loandao.addobjpersistent(la);
	}
	
	@Transactional
	public void addAll(Collection<LoanInputApplication> laList) {
		for (LoanInputApplication lo : laList) {
			loandao.addobjpersistent(lo);
		}
	}
	
	Collection<LoanInputApplication> l1;
	
	@Transactional
	public void DataInsertion(LoanInputApplication la)
	{
		

		Customers cs=new Customers();
		try {
			cs.setCustfirstname(la.getCustfirstname());
			cs.setCustlastname(la.getCustlastname());
			cs.setCustdob(la.getCustdob());
			cs.setCustpanno(la.getCustpanno());
			cs.setCustmobile(la.getCustmobile());
			cs.setCustaddress(la.getCustaddress());
			cs.setCustgname(la.getCustgname());
			cs.setCustluudate(la.getCustluudate());
			cs.setCustluser(la.getCustluser());
		} catch (Exception e) {
			e.printStackTrace();
		}
		loandao.savecustomers(cs);
		
		
		
		LoanApplicantNominees lan=new LoanApplicantNominees();
		try {
			lan.setLnapid(la.getLnapid1());
			lan.setLnapnominee(la.getLnapnominee());
			lan.setLnaprelation(la.getLnaprelation());
		}catch (Exception e) {
			e.printStackTrace();
		}
		loandao.saveLAN(lan);
		
		
		LoanApplicants loan=new LoanApplicants();
		try {
			loan.setLnapid(la.getLnapid2());
			loan.setLnapcustid(la.getLnapcustid());
			loan.setLnapapdate(la.getLnapapdate());
			loan.setLnaplntyid(la.getLnaplntyid());
			loan.setLnapamount(la.getLnapamount());
			loan.setLnapemirangefrom(la.getLnapemirangefrom());
			loan.setLnapemirangeto(la.getLnapemirangeto());
			loan.setLnapnomrequested(la.getLnapnomrequested());
			loan.setLnapcibilscore(la.getLnapcibilscore());
			loan.setLnapstatus(la.getLnapstatus());
			loan.setLnapconclusionremarks(la.getLnapconclusionremarks());
			loan.setLnapprocesseduser(la.getLnapprocesseduser());
			loan.setLnapprocessedDate(la.getLnapprocessedDate());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		loandao.saveLoan(loan);
		
	}
	
	
	@Transactional
	public boolean checkCredentials(User userobj) {
		
		User l1 =loandao.getdata(userobj.getUserid());
		
		Long userid=userobj.getUserid();
		String password=Integer.toString(userobj.getUserpwd().hashCode());
		String email=userobj.getUseremail();
		
			if (l1.getUserid().equals(userid) && l1.getUserpwd().equals(password) && l1.getUseremail().equals(email)) {
				return true; 
			}
		
		return false; 
	}
	
	@Transactional
	public void RegisterData(User userobj) {
		int hc=userobj.getUserpwd().hashCode();
		String hcpassword = Integer.toString(hc);
		userobj.setUserpwd(hcpassword);
		loandao.UserRegister(userobj);
	}
	
}
