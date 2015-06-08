package com.tp.springdata.neo4j.service;

import org.springframework.data.neo4j.conversion.Result;
import com.tp.springdata.neo4j.domain.*;

public interface IncidentService {

   Incident create(Incident incident);
   void delete(Incident incident);		
   Incident findById(long id);
   Incident findByref(String ref);
   Result<Incident> findAll();
}
