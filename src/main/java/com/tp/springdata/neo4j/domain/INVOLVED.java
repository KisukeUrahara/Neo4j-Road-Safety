package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.*;

@RelationshipEntity
public class INVOLVED
{
    @GraphId Long id;
    @EndNode Incident inc;
    @Fetch
    @StartNode Vehicle v;
    public INVOLVED() {
    }

    public INVOLVED(Vehicle mod, Incident manu) {
        this.v = mod;
        this.inc = manu;
        //this.name = roleName;
    }
    public  void setIncident(Incident name) {
    	this.inc = name;    }

    public void setVehicle(Vehicle name) {
        this.v = name;
    }

    public Vehicle getVehicle() {
        return v;
    }

    public Incident getIncident() {
        return inc;
    }

    @Override
    public String toString() {
        return String.format("%s involved in  %s", v,inc);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        INVOLVED role = (INVOLVED) o;
        if (id == null) return super.equals(o);
        return id.equals(role.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }
   // String name;
}
