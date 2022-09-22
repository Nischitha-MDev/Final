package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.EmpAddressMasterBean;
import com.example.demo.bean.EmployeBean;
import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.Dependants;
import com.example.demo.entities.Designation;
import com.example.demo.entities.EmpAddressMaster;
import com.example.demo.service.EmpAddressMasterService;
import com.example.demo.service.EmployeService;

@RestController
public class EmpAddressMasterController {
	
	@Autowired //tells the spring that, injection need to occur here, then spring searches for that EmployeService component and injects it here
	EmpAddressMasterService empAddressMasterService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/employeaddress/add")
	public String insertEmployeAddressMaster(@RequestBody EmpAddressMasterBean emp)
	{
		return empAddressMasterService.addEmployeAddressMaster(emp);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/employeaddress/update")
	public String updateEmployeAddressMaster(@RequestBody EmpAddressMasterBean emp)
	{
		return empAddressMasterService.updateEmpAddressMaster(emp);
	}
	
	
	@GetMapping(value="/empaddressmaster/find/{id}")
	public Map<String,String> findEmpAddressMaster(@PathVariable Integer id)
	{
		//@PathVariable takes the part of url as value her {id} taken as id value
		Map<String,String> message = new LinkedHashMap<>(); // to store student details
	
		//this.studentService.find(id) returns Optional<> whose methods are isPresent and get()
		//if(this.employeAddressMasterService.find(id)) { // if the given student id is present
	//employeAddress = this.dependantService.find(id).get(); //fetches the student record from the database
			//Getting student detail with help of getter methods
		EmpAddressMaster empAddressMaster = null;
			message.put("ID", empAddressMaster.getId().toString());
			message.put("Address", empAddressMaster.getAddress());
			message.put("Type", empAddressMaster.getType().toString());
			message.put("Empid",empAddressMaster.getEmpid().toString() );
			//message.put("Employee", foundDependants.getEmp_id().getName());
		//}
		//else { 
		//	message.put("Error","Cannot find dependant with id "+id);
	//	}
		return message;
	}

}