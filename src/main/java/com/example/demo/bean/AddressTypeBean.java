package com.example.demo.bean;

import com.example.demo.entities.EmpAddressMaster;

public class AddressTypeBean {
	private Integer id;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AddressTypeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressTypeBean(Integer id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	

}
