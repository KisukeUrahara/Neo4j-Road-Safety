package com.tp.springdata.neo4j.domain;

import org.springframework.data.neo4j.annotation.*;

@RelationshipEntity(type="MAKES")
public class MAKES
{
    @GraphId Long id;
    @EndNode Model Mod;
    @Fetch
    @StartNode Manufacturer Manu;
    public MAKES() {
    }

    public MAKES(Model mod, Manufacturer manu) {
        this.Mod = mod;
        this.Manu = manu;
        //this.name = roleName;
    }
    public  void setMod(Model name) {
    	this.Mod = name;    }

    public void setManu(Manufacturer name) {
        this.Manu = name;
    }

    public Manufacturer getManu() {
        return Manu;
    }

    public Model getMod() {
        return Mod;
    }

    @Override
    public String toString() {
        return String.format("%s manufactures  %s", Manu,Mod);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MAKES role = (MAKES) o;
        if (id == null) return super.equals(o);
        return id.equals(role.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }
   // String name;
}
