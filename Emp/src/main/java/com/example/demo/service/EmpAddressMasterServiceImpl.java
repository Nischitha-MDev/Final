package com.example.demo.service;

import java.util.Optional;




import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.EmpAddressMaster;
import com.example.demo.entities.Employe;

import com.example.demo.repository.AddressMasterRepository;
import com.example.demo.repository.EmpAddressMasterRepository;



@Transactional //Spring dynamically creates a proxy that implements the same interface(s) as the class that gets annotated
@Service("empaddressmasterService") // to detected by @Autowired
public class EmpAddressMasterServiceImpl implements EmpAddressMasterService{



	@Autowired //automatically injects the implementation of crudrepo
	private EmpAddressMasterRepository empaddressmasterRepository;

	public Optional<EmpAddressMaster> find(Integer id)
	{
		return this.empaddressmasterRepository.findById(id);
	}

	public EmpAddressMaster saveempaddressmaster(EmpAddressMaster empaddressmaster) {
		return this.empaddressmasterRepository.save(empaddressmaster);
	}


	public EmpAddressMaster  getEmpAddressMaster(int id)
	{
		return empaddressmasterRepository.findById(id).get();
	}



	public EmpAddressMaster updatedEmpAddressMaster(EmpAddressMaster empaddressmaster) 
	{
		EmpAddressMaster emp= empaddressmasterRepository.findById(empaddressmaster.getId()).get();
		emp.setAddress(empaddressmaster.getAddress());


		return empaddressmasterRepository.save(emp);
	}



	/*public AddressMaster updatedAddressMaster(AddressMaster addressmaster) 
	{
		AddressMaster emp= addressmasterRepository.findById(addressmaster.getId()).get();
		emp.setPermanentaddress(addressmaster.getPermanentaddress());


		return addressmasterRepository.save(emp);
	}
	 */


	public String deleteEmpAddressMaster11(int id)
	{
		empaddressmasterRepository.deleteById(id);
		return "Entity deleted "+id;
	}

	public EmpAddressMaster savedeleteEmpAddressMaster(EmpAddressMaster empaddressmaster) {
		// TODO Auto-generated method stub
		return this.saveempaddressmaster(empaddressmaster);
	}

	public EmpAddressMaster getEmpAddressMaster11(int id) {
		// TODO Auto-generated method stub
		return this.getEmpAddressMaster(id);
	}

	public EmpAddressMaster updateEmpAddressMaster1(EmpAddressMaster empaddressmaster) {
		// TODO Auto-generated method stub
		return this.saveempaddressmaster(empaddressmaster);
	}

	public String deleteEmpAddressMaster1(int id) {
		// TODO Auto-generated method stub
		return this.deleteEmpAddressMaster11(id);
	}

	public EmpAddressMaster saveEmpAddressMaster1(EmpAddressMaster empaddressmaster) {
		// TODO Auto-generated method stub
		return this.saveempaddressmaster(empaddressmaster);
	}


	@Override
	public EmpAddressMaster getEmpAddressMaster1(int id) {
		// TODO Auto-generated method stub
		return this.getEmpAddressMaster11(id);
	}

	@Override
	public EmpAddressMaster updateEmpAddressMaster(EmpAddressMaster empaddressmaster) {
		// TODO Auto-generated method stub
		return this.updatedEmpAddressMaster(empaddressmaster);
	}

	@Override
	public String deleteEmpAddressMaster(int id) {
		// TODO Auto-generated method stub
		return this.deleteEmpAddressMaster(id);
	}


	@Override
	public EmpAddressMaster saveEmpAddressMaster(EmpAddressMaster empaddressmaster) {
		// TODO Auto-generated method stub
		return this.saveEmpAddressMaster(empaddressmaster);
	}

	@Override
	public EmpAddressMaster saveDepartment(EmpAddressMaster empaddressmaster) {
		// TODO Auto-generated method stub
		return null;
	}




}








