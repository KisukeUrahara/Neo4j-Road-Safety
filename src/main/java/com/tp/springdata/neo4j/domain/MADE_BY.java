package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.*;

@RelationshipEntity
public class MADE_BY
{
    @GraphId Long id;
    @EndNode Manufacturer Manu;
    @Fetch
    @StartNode Vehicle v;
    public MADE_BY() {
    }

    public MADE_BY(Vehicle mod, Manufacturer manu) {
        this.v = mod;
        this.Manu = manu;
        //this.name = roleName;
    }
    public  void setVehicle(Vehicle v) {
    	this.v = v;    }

    public void setManufacturer(Manufacturer name) {
        this.Manu = name;
    }

    public Manufacturer getManu() {
        return Manu;
    }

    public Vehicle getVehicle() {
        return v;
    }

    @Override
    public String toString() {
        return String.format("%s made by  %s",v, Manu);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

MADE_BY role = (MADE_BY) o;
        if (id == null) return super.equals(o);
        return id.equals(role.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }
   // String name;
}
