package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.*;

@RelationshipEntity
public class DRIVER_AGE
{
    @GraphId Long id;
    @EndNode AgeBand Manu;
    @Fetch
    @StartNode Vehicle v;
    public DRIVER_AGE() {
    }

    public DRIVER_AGE(Vehicle mod, AgeBand manu) {
        this.v = mod;
        this.Manu = manu;
        //this.name = roleName;
    }
    public  void setVehicle(Vehicle v) {
    	this.v = v;    }

    public void setAgeBand(AgeBand name) {
        this.Manu = name;
    }

    public AgeBand getManu() {
        return Manu;
    }

    public Vehicle getVehicle() {
        return v;
    }

    @Override
    public String toString() {
        return String.format("%s driver age belongs to  %s",v, Manu);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

DRIVER_AGE role = (DRIVER_AGE) o;
        if (id == null) return super.equals(o);
        return id.equals(role.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }
   // String name;
}
