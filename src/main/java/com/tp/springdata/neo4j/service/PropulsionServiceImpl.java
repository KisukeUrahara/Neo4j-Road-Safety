package com.tp.springdata.neo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;

import com.tp.springdata.neo4j.dao.PropulsionRepository;
import com.tp.springdata.neo4j.domain.Propulsion;

@Service
public class PropulsionServiceImpl implements PropulsionService {

   @Autowired
   private PropulsionRepository PropulsionRepository;	

   public Propulsion create(Propulsion profile) {
      return PropulsionRepository.save(profile);
   }

   public void delete(Propulsion Propulsion) {		
      PropulsionRepository.delete(Propulsion);
   }
   public Propulsion findByName(String name)
   {
	   return PropulsionRepository.findByName(name);
   }
   public Propulsion findById(long id) {		
	   
      return PropulsionRepository.findOne(id);
   }

   public Result<Propulsion> findAll() {		
      return PropulsionRepository.findAll();
   }
}