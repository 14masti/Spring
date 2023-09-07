package com.masti.orm.loan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.masti.orm.loan.model.Customers;
import com.masti.orm.loan.model.LoanApplicantNominees;
import com.masti.orm.loan.model.LoanApplicants;
import com.masti.orm.loan.model.LoanInputApplication;

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

	


}
