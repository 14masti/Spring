package com.masti.orm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="masti_emp")
@Entity
public class Employee {
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empNo;
	private Integer deptNo;
	private String eName;
	private String job;
	private Double salary;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", deptNo=" + deptNo + ", eName=" + eName + ", job=" + job + ", salary="
				+ salary + "]";
	}
	

}
