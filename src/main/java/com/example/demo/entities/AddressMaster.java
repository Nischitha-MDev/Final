package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="addressmaster")

public class AddressMaster implements Serializable {
	
	@Id //specified the primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id",unique = true,nullable = false)
	private int id;
	private String currentaddress;
	private String permanentaddress;
	
	
	
	public AddressMaster() {
		super();
	}

	public AddressMaster(int id, String currentaddress, String permanentaddress) {
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
	
	
	public AddressMaster(String currentaddress, String permanentaddress) {
		super();
		this.currentaddress = currentaddress;
		this.permanentaddress = permanentaddress;
	}
	@Column(name="currentaddress",nullable = false) 
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	@Column(name="permanentaddress",nullable = false) 
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	

}
