package com.tp.springdata.neo4j.service;

import org.springframework.data.neo4j.conversion.Result;
import com.tp.springdata.neo4j.domain.*;

public interface ManufacturerService {

   Manufacturer create(Manufacturer Manufacturer);
   void delete(Manufacturer Manufacturer);		
   Manufacturer findById(long id);
   Manufacturer findByName(String name);
   Result<Manufacturer> findAll();
}
