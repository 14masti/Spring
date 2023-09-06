package com.masti.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.masti.orm.model.Employee;

@Component
public class EmpDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void persist(Employee emp) {
		em.persist(emp);
	}
	
	public List<Employee> findAll() {
		return em.createQuery("SELECT e FROM Employee e").getResultList();
	}
}
