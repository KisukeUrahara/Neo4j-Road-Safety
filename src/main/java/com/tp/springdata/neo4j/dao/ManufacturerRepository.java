package com.tp.springdata.neo4j.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.tp.springdata.neo4j.domain.*;
public interface ManufacturerRepository extends GraphRepository<Manufacturer>{
	Manufacturer findByName(String name);
	Manufacturer findById(Long id);

}