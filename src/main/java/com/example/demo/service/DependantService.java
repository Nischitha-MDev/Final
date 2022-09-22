package com.example.demo.service;

import java.util.Optional;

import com.example.demo.bean.DependantsBean;
import com.example.demo.entities.Department;
import com.example.demo.entities.Dependants;
import com.example.demo.entities.Designation;
import com.example.demo.entities.Employe;

public interface DependantService {
	public Optional<Dependants> find(Integer id);
	public Dependants insertDependants(Dependants dependant);
	public String updateDependants(DependantsBean dependant);
	public boolean deleteDependants(Dependants dependant);
	
	public String addDependant(DependantsBean dep);
	
}
