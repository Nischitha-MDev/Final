package com.example.demo.service;

import java.util.Optional;

import com.example.demo.bean.EmpAddressMasterBean;
import com.example.demo.bean.EmployeBean;
import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.Designation;
import com.example.demo.entities.Employe;
import com.example.demo.entities.EmpAddressMaster;

public interface EmpAddressMasterService {
	public String addEmployeAddressMaster(EmpAddressMasterBean emp);
	public String updateEmpAddressMaster(EmpAddressMasterBean emp);
	public  EmpAddressMaster  getEmpAddressMaster(int id);
}