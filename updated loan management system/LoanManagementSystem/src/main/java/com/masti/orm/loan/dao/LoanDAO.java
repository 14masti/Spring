package com.masti.orm.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.masti.orm.loan.model.Customers;
import com.masti.orm.loan.model.LoanApplicantNominees;
import com.masti.orm.loan.model.LoanApplicants;
import com.masti.orm.loan.model.LoanInputApplication;
import com.masti.orm.loan.model.User;

@Component
public class LoanDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void addobjpersistent(LoanInputApplication la) {
		em.persist(la);
	}
	
	public void savecustomers(Customers customer) {
		em.persist(customer);
	}
	
	public void saveLAN(LoanApplicantNominees lan) {
		em.persist(lan);
	}
	
	public void saveLoan(LoanApplicants loan) {
		em.persist(loan);
	}
	
	public void UserRegister(User us) {
		em.persist(us);
	}
	
	

	public User getdata(Long long1) {
	    return (User) em.createQuery("SELECT e FROM User e WHERE e.userid = :num").setParameter("num", long1).getSingleResult();
	}



}
