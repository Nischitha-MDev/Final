package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employe;
import com.example.demo.repository.EmployeRepository;


@Transactional
@Service("employeeService")
public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	private EmployeRepository employeeRepository;

	@Override
	public Employe insert(Employe employee) {
		return this.employeeRepository.save(employee);
	}

}
