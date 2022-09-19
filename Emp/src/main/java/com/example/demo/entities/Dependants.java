package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.bean.DependantsBean;

@Entity
@Table(name="dependants")
public class Dependants implements Serializable{
	
private static final long serialVersionUID = 1L;
	

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",unique = true,nullable = false)
	private Integer id;

    @ManyToOne(fetch=FetchType.LAZY)//Manytoone since many students belong to one department
    @JoinColumn(name="empid",nullable = false)
	private Employe emp_id;

    @Column(name="name",nullable = false)
	private String name;

    @Column(name="relation",nullable = false)
	private String relation;

    @Column(name="joiningdate",nullable = false)
	private Date joiningdate;
	
	
	public Dependants() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Employe getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Employe emp_id) {
		this.emp_id = emp_id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
	public Date getjoiningdate() {
		return joiningdate;
	}
	public void setjoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public Dependants(Integer id, Employe emp_id, String name, String relation, Double age) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.name = name;
		this.relation = relation;
		this.joiningdate = joiningdate;
	}
	
	public Dependants(String name, String relation, Date joiningdate) {
		super();
		this.name = name;
		this.relation = relation;
		this.joiningdate = joiningdate;
	}
	

	
}

