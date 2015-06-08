package com.tp.springdata.neo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;

import com.tp.springdata.neo4j.dao.VehicleRepository;
import com.tp.springdata.neo4j.domain.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

   @Autowired
   private VehicleRepository VehicleRepository;	

   public Vehicle create(Vehicle profile) {
      return VehicleRepository.save(profile);
   }

   public void delete(Vehicle vehicle) {		
      VehicleRepository.delete(vehicle);
   }
   public Vehicle findByindex(String index)
   {
	   return VehicleRepository.findByindex(index);
   }
   public Vehicle findById(long id) {		
	   
      return VehicleRepository.findOne(id);
   }

   public Result<Vehicle> findAll() {		
      return VehicleRepository.findAll();
   }
}