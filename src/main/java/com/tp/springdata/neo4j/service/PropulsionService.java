package com.tp.springdata.neo4j.service;

import org.springframework.data.neo4j.conversion.Result;
import com.tp.springdata.neo4j.domain.*;

public interface PropulsionService {

   Propulsion create(Propulsion Propulsion);
   void delete(Propulsion Propulsion);		
   Propulsion findById(long id);
   Propulsion findByName(String name);
   Result<Propulsion> findAll();
}
