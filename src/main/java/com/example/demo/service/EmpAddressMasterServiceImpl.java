package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.EmpAddressMasterBean;
import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.Department;
import com.example.demo.entities.Designation;
import com.example.demo.entities.Employe;
import com.example.demo.entities.EmpAddressMaster;
import com.example.demo.repository.EmpAddressMasterRepository;
import com.example.demo.repository.EmployeRepository;


@Transactional
@Service("empMasterAddressService")
public class EmpAddressMasterServiceImpl implements EmpAddressMasterService {

	
	@Autowired
	private EmpAddressMasterRepository empAddressMasterRepository;
	
	public String  addEmployeAddressMaster(EmpAddressMasterBean addemp) {
		EmpAddressMaster master = new EmpAddressMaster();
		Employe emp = new Employe();
		emp.setId(addemp.getEmpid().getId());
		master.setAddress(addemp.getAddress());
		master.setType(addemp.getType());
		master.setEmpid(emp);
		empAddressMasterRepository.save(master);
		return "employe address master addedd successfully";
	}
	
	@Override
	public String updateEmpAddressMaster(EmpAddressMasterBean addemp) {
		EmpAddressMaster master = new EmpAddressMaster();
		Employe emp = new Employe();
		emp.setId(addemp.getEmpid().getId());
		master.setAddress(addemp.getAddress());
		master.setType(addemp.getType());
		master.setEmpid(emp);
		master.setId(addemp.getId());
		empAddressMasterRepository.save(master);
		return "employe address master addedd successfully";
	}

	public  EmpAddressMaster  getEmpAddressMaster(int id)
	{
		return empAddressMasterRepository.findById(id).get();
	}

	
}