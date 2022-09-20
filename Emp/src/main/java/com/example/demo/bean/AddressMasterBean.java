package com.example.demo.bean;

public class AddressMasterBean {
	private int id;
	public AddressMasterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String currentaddress;
	private String permanentaddress;
	
	public AddressMasterBean(int id, String currentaddress, String permanentaddress) {
		super();
		this.id = id;
		this.currentaddress = currentaddress;
		this.permanentaddress = permanentaddress;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	

}
