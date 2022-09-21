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
import com.example.demo.entities.EmpAddressMaster;
import com.example.demo.service.AddressMasterService;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmpAddressMasterService;

@RestController
public class EmpAddressMasterController {
	
	@Autowired
EmpAddressMasterService empaddressmasterService;
	
	@PostMapping(value = "/EmpAddressMaster/insert",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public EmpAddressMaster addEmpAddressMaster(@RequestBody EmpAddressMaster addressmaster)
	{
	
		return empaddressmasterService.saveEmpAddressMaster(addressmaster);
		
	}
	
	@GetMapping(path ="/EmpAddressMaster/findby/{id}")
	public EmpAddressMaster getEmpAddressMaster(@PathVariable int id)
	{
		return empaddressmasterService.getEmpAddressMaster1(id);
	}
	
	@PutMapping("/EmpAddressMaster/update")
	public EmpAddressMaster updateEmpAddressMaster(@RequestBody EmpAddressMaster empaddressmaster)
	{
		return empaddressmasterService.updateEmpAddressMaster(empaddressmaster);
	}
	
	@DeleteMapping(path ="/EmpAddressMaster/{id}")
	public String deleteEmpAddressMaster(@PathVariable int id)
	{
		return empaddressmasterService.deleteEmpAddressMaster(id);
	}

}
