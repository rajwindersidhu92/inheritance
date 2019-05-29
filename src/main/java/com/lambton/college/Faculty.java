package com.lambton.college;

import java.util.Date;

public class Faculty extends Person {

    private String departmenttName;
    private String designation;
    private float salary;
    private Date joiningDate;

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDepartmenttName() {
        return departmenttName;
    }

    public void setDepartmenttName(String departmenttName) {
        this.departmenttName = departmenttName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
