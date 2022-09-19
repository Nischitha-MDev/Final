package com.example.demo.bean;

import java.util.Date;

import com.example.demo.entities.Employe;

public class DependantsBean {
	private Integer id;
	private Date joiningdate;
	private String name;
	private String relation;
	private Employe emp_id;
	private EmployeBean employe;
	
	public DependantsBean(Integer id, Employe emp_id, String name, String relation, Date joiningdate, EmployeBean employe) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.name = name;
		this.relation = relation;
		this.joiningdate = joiningdate;
		this.employe = employe;
	}
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public DependantsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DependantsBean(Integer id, Employe emp_id, String name, String relation, Date joiningdate) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.name = name;
		this.relation = relation;
		this.joiningdate =joiningdate;
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
	
	

}
