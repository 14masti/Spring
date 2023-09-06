package com.masti.orm.service;

import java.util.Collection;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masti.orm.dao.EmpDAO;
import com.masti.orm.model.Employee;

@Service
public class EmpService {
	
	@Autowired
	private EmpDAO empdao;
	
	@Transactional
	public void add(Employee emp) {
		empdao.persist(emp);
	}
	
	@Transactional
	public void addAll(Collection<Employee> emplist)
	{
		for(Employee e:emplist)
			empdao.persist(e);
	}
	
	@Transactional(readOnly=true)
	public List<Employee> ListAll()
	{
		return empdao.findAll();
	}

}
