package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
//import org.springframework.data.neo4j.annotation.RelationshipEntity;


@NodeEntity
public class AgeBand {

   @GraphId Long id;			
   private String name;
   private int code;
  
   public Long getId() {
      return id;
   }		
   
   public String getName() {
      return name;
   }
   
   public void setName(String n) {
      name = n;
   }
   public int getcode() {
	      return code;
	   }
	   
	   public void setcode(int n) {
	      code = n;
	   }
	   
   
   public boolean equals(Object other) {
   
      if (this == other)
         return true;

      if (id == null) 
         return false;

      if (! (other instanceof AgeBand)) 
         return false;

      return id.equals(((AgeBand) other).id);
   }
   
   public int hashCode() {
      return id == null ? System.identityHashCode(this) : id.hashCode();
   }	
   
   public String toString(){
      return "AgeBand[id:"+ id +",name:"+ name+"]";
   }			
}

