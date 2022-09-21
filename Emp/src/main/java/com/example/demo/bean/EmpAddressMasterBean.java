package com.example.demo.bean;

public class EmpAddressMasterBean {
	private int id;
	public EmpAddressMasterBean(int id, String address, int type, int empid) {
		super();
		this.id = id;
		this.address = address;
		this.type = type;
		this.empid = empid;
	}
	private String address;
	private int type;
	private int empid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public EmpAddressMasterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
		
}
	