package com.example.demo.entities;

import java.util.Optional;

import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.EmployeService;



public interface EmployeService {
	public Optional<AddressMaster> find(Integer id);
	public AddressMaster saveDepartment(AddressMaster addressmaster);
	public AddressMaster getAddressMaster1(int id);
	public AddressMaster updateAddressMaster(AddressMaster addressmaster);
	public String deleteAddressMaster(int id);
	public AddressMaster saveAddressMaster(AddressMaster addressmaster);
	
}
