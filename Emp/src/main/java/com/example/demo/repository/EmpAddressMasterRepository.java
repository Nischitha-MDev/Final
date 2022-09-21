package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AddressMaster;
import com.example.demo.entities.EmpAddressMaster;


@Repository("empaddressmasterRepository")
public interface EmpAddressMasterRepository extends CrudRepository<EmpAddressMaster, Integer>{

}
