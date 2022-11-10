package org.example.domain;

import java.io.Serializable;

public class Departement implements Serializable {

    private  Integer depId;
    private  String name;

    public Departement(String name) {
        this.name = name;
    }

    public  Departement(){

    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "depId=" + depId +
                ", name='" + name + '\'' +
                '}';
    }
}
