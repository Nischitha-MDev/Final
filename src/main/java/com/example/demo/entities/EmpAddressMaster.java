package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity//mapped to database table
@Table(name="EMPADDRESSMASTER")
public class EmpAddressMaster {
	
	@Id //specified the primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //uses the database identity column
	@Column(name="ID",unique = true,nullable = false) //name is optional is variable name matches table field name
	private Integer id;
	
	@Column(name="ADDRESS",nullable = false) // nullable checks whether null accepted, before db throws error
	private String address;
	
	@Column(name="Type",nullable = false)
	private Integer Type;
	
	 @ManyToOne(fetch=FetchType.LAZY)//Manytoone since many employe belong to one employe
	 @JoinColumn(name="EMPID",nullable = false)//used to join the entity
	private Employe empid;

	public EmpAddressMaster(Integer id, String address, Integer type, Employe empid) {
		super();
		this.id = id;
		this.address = address;
		this.Type = type;
		this.empid = empid;
	}

	public EmpAddressMaster(String address, Integer type) {
		
		this.address = address;
		this.Type = type;
	}

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

	public Integer getType() {
		return Type;
	}

	public void setType(Integer type) {
		Type = type;
	}

	public Employe getEmpid() {
		return empid;
	}

	public void setEmpid(Employe empid) {
		this.empid = empid;
	}

	public EmpAddressMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}