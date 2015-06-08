package com.tp.springdata.neo4j.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.tp.springdata.neo4j.domain.*;
public interface VehicleRepository extends GraphRepository<Vehicle>{
	Vehicle findByindex(String index);
	Vehicle findById(Long id);
	Vehicle findByAge(int age);

}