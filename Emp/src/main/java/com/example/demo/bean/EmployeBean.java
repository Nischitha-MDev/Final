package com.example.demo.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EmployeBean {
	private Integer id;
	private String name;
	private Date joiningdate;
	private DesignationBean designation;
	private DepartmentBean department;
	public EmployeBean(Integer id, String name, Date joiningdate, DesignationBean designation,
			DepartmentBean department) {
		super();
		this.id = id;
		this.name = name;
		this.joiningdate = joiningdate;
		this.designation = designation;
		this.department = department;
	}
	public EmployeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public DesignationBean getDesignation() {
		return designation;
	}
	public void setDesignation(DesignationBean designation) {
		this.designation = designation;
	}
	public DepartmentBean getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentBean department) {
		this.department = department;
	}
	
	
}
