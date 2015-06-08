package com.tp.springdata.neo4j.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.tp.springdata.neo4j.domain.*;
public interface PropulsionRepository extends GraphRepository<Propulsion>{
	Propulsion findByName(String name);
	Propulsion findById(Long id);

}