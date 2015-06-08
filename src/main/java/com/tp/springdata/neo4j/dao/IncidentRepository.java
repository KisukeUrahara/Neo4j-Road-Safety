package com.tp.springdata.neo4j.dao;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.tp.springdata.neo4j.domain.*;
public interface IncidentRepository extends GraphRepository<Incident>{
	Incident findByref(String ref);
	Incident findById(Long id);

}