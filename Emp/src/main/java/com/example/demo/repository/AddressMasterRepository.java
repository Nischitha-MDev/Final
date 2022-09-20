package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AddressMaster;


@Repository("addressmasterRepository")
public interface AddressMasterRepository extends CrudRepository<AddressMaster, Integer>{

}
