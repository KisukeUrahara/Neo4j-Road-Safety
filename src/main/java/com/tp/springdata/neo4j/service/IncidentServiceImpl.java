package com.tp.springdata.neo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;

import com.tp.springdata.neo4j.dao.IncidentRepository;
import com.tp.springdata.neo4j.domain.Incident;

@Service
public class IncidentServiceImpl implements IncidentService {

   @Autowired
   private IncidentRepository accidentRepository;	

   public Incident create(Incident profile) {
      return accidentRepository.save(profile);
   }

   public void delete(Incident Incident) {		
      accidentRepository.delete(Incident);
   }
   public Incident findByref(String ref)
   {
	   return accidentRepository.findByref(ref);
   }
   public Incident findById(long id) {		
	   
      return accidentRepository.findOne(id);
   }

   public Result<Incident> findAll() {		
      return accidentRepository.findAll();
   }
}