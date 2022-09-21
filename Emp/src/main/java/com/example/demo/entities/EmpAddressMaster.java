package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="empaddressmaster")

public class EmpAddressMaster implements Serializable {
	
	@Id //specified the primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id",unique = true,nullable = false)
	private int id;
	public EmpAddressMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpAddressMaster(int id, String address, int type, int empid) {
		super();
		this.id = id;
		this.address = address;
		this.type = type;
		this.empid = empid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
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
	private String address;
	private int type;
	private int empid;
}
	
	
	