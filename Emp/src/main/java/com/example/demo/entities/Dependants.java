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

@Entity//mapped to database table
@Table(name="dependants")//add the table name in the particular database
public class Dependants implements Serializable{
	
private static final long serialVersionUID = 1L;
	

    @Id//primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",unique = true,nullable = false)
	private Integer id;

    
  //Lazy--only fetch the related entities from the database when we use the relationship
    @ManyToOne(fetch=FetchType.LAZY)//Manytoone since many employe belong to one employe
    @JoinColumn(name="empid",nullable = false)//used to join the entity
	private Employe emp_id;

    @Column(name="name",nullable = false)
	private String name;

    @Column(name="relation",nullable = false)
	private String relation;

    @Column(name="age",nullable = false)
	private Integer age;
	
	
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
	
	
	public Integer  getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Dependants(String name, String relation, Integer  age) {
		super();
		this.name = name;
		this.relation = relation;
		this.age = age;
	}
	public Dependants(Integer id, Employe emp_id, String name, String relation, Integer age) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.name = name;
		this.relation = relation;
		this.age = age;
	}

	
}