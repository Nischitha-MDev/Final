package com.example.demo.entities;

import java.util.Date;

public class EmployeJoin {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Date joiningdate;
	private String departmentName;
	private String designation;
	private String addressmaster;
	
	public EmployeJoin(Integer id, String name, Date joiningdate, String departmentName, String designation,
			String addressmaster) {
		super();
		this.id = id;
		this.name = name;
		this.joiningdate = joiningdate;
		this.departmentName = departmentName;
		this.designation = designation;
		this.addressmaster = addressmaster;
	}
	public String getAddressmaster() {
		return addressmaster;
	}
	public void setAddressmaster(String addressmaster) {
		this.addressmaster = addressmaster;
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
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public EmployeJoin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getjoiningdate() {
		return joiningdate;
	}
	public void setjoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EmployeJoin(Integer id, String name, Double age, String departmentName, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.joiningdate = joiningdate;
		this.departmentName = departmentName;
		this.designation = designation;
	}
	
	
	
	
	
	

}
