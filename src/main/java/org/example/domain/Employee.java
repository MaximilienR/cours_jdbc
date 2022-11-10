package org.example.domain;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private  Integer empId;
    private Date startDate;
    private  Date endDate;
    private  String firstName;
    private  String lasName;
    private  String title;
    private  Departement departement;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  Employee(){


    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", title='" + title + '\'' +
                ", departement=" + departement +
                '}';
    }
}
