package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
//import org.springframework.data.neo4j.annotation.RelationshipEntity;


@NodeEntity
public class Manufacturer {

   @GraphId Long id;			
   private String name;
   //private String sex;
  
   public Long getId() {
      return id;
   }		
   
   public String getName() {
      return name;
   }
   
   public void setName(String n) {
      name = n;
   }
   
   
   public boolean equals(Object other) {
   
      if (this == other)
         return true;

      if (id == null) 
         return false;

      if (! (other instanceof Manufacturer)) 
         return false;

      return id.equals(((Manufacturer) other).id);
   }
   
   public int hashCode() {
      return id == null ? System.identityHashCode(this) : id.hashCode();
   }	
   
   public String toString(){
      return "Manufacturer[id:"+ id +",name:"+ name+"]";
   }			
}

