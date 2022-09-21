package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entities.EmpAddressMaster;
import com.example.demo.entities.Employe;



public interface EmpAddressMasterService {
	public Optional<EmpAddressMaster> find(Integer id);
	public EmpAddressMaster saveDepartment(EmpAddressMaster empaddressmaster);
	public EmpAddressMaster getEmpAddressMaster1(int id);
	public EmpAddressMaster updateEmpAddressMaster(EmpAddressMaster empaddressmaster);
	public String deleteEmpAddressMaster(int id);
	public EmpAddressMaster saveEmpAddressMaster(EmpAddressMaster empaddressmaster);
	
}
