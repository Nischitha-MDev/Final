package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.Department;
import com.example.demo.service.AddressMasterService;
import com.example.demo.service.DepartmentService;

@RestController
public class AddressMasterController {
	
	@Autowired
AddressMasterService addressmasterService;
	
	@PostMapping(value = "/AddressMaster/insert",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public AddressMaster addAddressMaster(@RequestBody AddressMaster addressmaster)
	{
	
		return addressmasterService.saveAddressMaster(addressmaster);
	}
	
	@GetMapping(path ="/AddressMaster/findby/{id}")
	public AddressMaster getAddressMaster(@PathVariable int id)
	{
		return addressmasterService.getAddressMaster1(id);
	}
	
	@PutMapping("/AddressMaster/update")
	public AddressMaster updateAddressMaster(@RequestBody AddressMaster addressmaster)
	{
		return addressmasterService.updateAddressMaster(addressmaster);
	}
	
	@DeleteMapping(path ="/AddressMaster/{id}")
	public String deleteAddressMaster(@PathVariable int id)
	{
		return addressmasterService.deleteAddressMaster(id);
	}

}
