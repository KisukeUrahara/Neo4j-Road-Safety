package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.*;

@RelationshipEntity(type="IS_A")
public class IS_A
{
    @GraphId Long id;
    @EndNode Model Manu;
    @Fetch
    @StartNode Vehicle v;
    public IS_A() {
    }

    public IS_A(Vehicle mod, Model manu) {
        this.v = mod;
        this.Manu = manu;
        //this.name = roleName;
    }
    public  void setVehicle(Vehicle v) {
    	this.v = v;    }

    public void setModel(Model name) {
        this.Manu = name;
    }

    public Model getManu() {
        return Manu;
    }

    public Vehicle getVehicle() {
        return v;
    }

    @Override
    public String toString() {
        return String.format("%s is a %s",v, Manu);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

IS_A role = (IS_A) o;
        if (id == null) return super.equals(o);
        return id.equals(role.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }
   // String name;
}
