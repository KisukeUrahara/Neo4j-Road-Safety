package com.tp.springdata.neo4j.domain;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
//import org.springframework.data.neo4j.annotation.RelationshipEntity;
@NodeEntity
public class Incident {

	   @GraphId Long id;			
	   private String ref;
	   //private String sex;
	  
	  	
	   public Long getId() {
		      return id;
		   }
	   public int hashCode() {
		      return id == null ? System.identityHashCode(this) : id.hashCode();
		   }	
	   public String getref() {
	      return ref;
	   }
	   
	   public void setref(String re) {
	      ref = re;
	   }
	   
	 	 	   
	   public String toString(){
	      return "Incident[ref:"+ ref+"]";
	   }			
	}



