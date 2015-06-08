package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
//import org.springframework.data.neo4j.annotation.RelationshipEntity;


@NodeEntity
public class Vehicle {

   @GraphId Long id;			
   private String index;
   private String age;
   //private String sex;
  
   public Long getId() {
      return id;
   }		
   
   public String getIndex() {
      return index;
   }
   
   public void setIndex(String inde) {
      index = inde;
   }
   
   public String getage() {
      return age;
   }
   
   public void setage(String age) {
      this.age = age;
   }
   
   public boolean equals(Object other) {
   
      if (this == other)
         return true;

      if (id == null) 
         return false;

      if (! (other instanceof Vehicle)) 
         return false;

      return id.equals(((Vehicle) other).id);
   }
   
   public int hashCode() {
      return id == null ? System.identityHashCode(this) : id.hashCode();
   }	
   
   public String toString(){
      return "Profile[id:"+ id +",index:"+ index +",age:" + age +"]";
   }			
}

