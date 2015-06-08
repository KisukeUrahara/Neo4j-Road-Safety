package com.tp.springdata.neo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;

import com.tp.springdata.neo4j.dao.ManufacturerRepository;
import com.tp.springdata.neo4j.domain.Manufacturer;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

   @Autowired
   private ManufacturerRepository ManufacturerRepository;	

   public Manufacturer create(Manufacturer profile) {
      return ManufacturerRepository.save(profile);
   }

   public void delete(Manufacturer Manufacturer) {		
      ManufacturerRepository.delete(Manufacturer);
   }
   public Manufacturer findByName(String name)
   {
	   return ManufacturerRepository.findByName(name);
   }
   public Manufacturer findById(long id) {		
	   
      return ManufacturerRepository.findOne(id);
   }

   public Result<Manufacturer> findAll() {		
      return ManufacturerRepository.findAll();
   }
}