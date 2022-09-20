package com.example.demo.service;

import java.util.Optional;




import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.Employe;

import com.example.demo.repository.AddressMasterRepository;



@Transactional //Spring dynamically creates a proxy that implements the same interface(s) as the class that gets annotated
@Service("addressmasterService") // to detected by @Autowired
public class AddressMasterServiceImpl implements AddressMasterService{
	

	
	@Autowired //automatically injects the implementation of crudrepo
	private AddressMasterRepository addressmasterRepository;
	
	public Optional<AddressMaster> find(Integer id)
	{
		return this.addressmasterRepository.findById(id);
	}
	
	public AddressMaster saveaddressmaster(AddressMaster addressmaster) {
		return this.addressmasterRepository.save(addressmaster);
	}
	
	
	public AddressMaster  getAddressMaster1(int id)
	{
		return addressmasterRepository.findById(id).get();
	}
	
	
	public AddressMaster updateDAddressMaster(AddressMaster addressmaster) 
	{
		AddressMaster emp= addressmasterRepository.findById(addressmaster.getId()).get();
		emp.setCurrentaddress(addressmaster.getCurrentaddress());
		
		
		return addressmasterRepository.save(emp);
	}
	
	public AddressMaster updatedAddressMaster(AddressMaster addressmaster) 
	{
		AddressMaster emp= addressmasterRepository.findById(addressmaster.getId()).get();
		emp.setPermanentaddress(addressmaster.getPermanentaddress());
		
		
		return addressmasterRepository.save(emp);
	}
	
	public String deleteAddressMaster1(int id)
	{
		addressmasterRepository.deleteById(id);
		return "Entity deleted "+id;
	}

	public AddressMaster savedeleteAddressMaster(AddressMaster addressmaster) {
		// TODO Auto-generated method stub
		return this.saveaddressmaster(addressmaster);
	}

	public AddressMaster getAddressMaster(int id) {
		// TODO Auto-generated method stub
		return this.getAddressMaster(id);
	}

	@Override
	public AddressMaster updateAddressMaster(AddressMaster addressmaster) {
		// TODO Auto-generated method stub
		return this.saveaddressmaster(addressmaster);
	}

	@Override
	public String deleteAddressMaster(int id) {
		// TODO Auto-generated method stub
		return this.deleteAddressMaster(id);
	}

	@Override
	public AddressMaster saveAddressMaster(AddressMaster addressmaster) {
		// TODO Auto-generated method stub
		return this.saveaddressmaster(addressmaster);
	}

	@Override
	public AddressMaster saveDepartment(AddressMaster addressmaster) {
		// TODO Auto-generated method stub
		return null;
	}

	


	}

	
	

	
	
	

