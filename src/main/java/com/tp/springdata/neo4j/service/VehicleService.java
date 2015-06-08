package com.tp.springdata.neo4j.service;

import org.springframework.data.neo4j.conversion.Result;
import com.tp.springdata.neo4j.domain.*;

public interface VehicleService {

   Vehicle create(Vehicle vehicle);
   void delete(Vehicle vehicle);		
   Vehicle findById(long id);
   Vehicle findByindex(String index);
   Result<Vehicle> findAll();
}
