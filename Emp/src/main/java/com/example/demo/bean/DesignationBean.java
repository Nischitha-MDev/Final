package com.example.demo.bean;

public class DesignationBean {
	private int id;
	public DesignationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DesignationBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
