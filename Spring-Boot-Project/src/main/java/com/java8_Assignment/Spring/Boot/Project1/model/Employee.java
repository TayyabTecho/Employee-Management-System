package com.java8_Assignment.Spring.Boot.Project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long employeeId;
     private String employeeName;
     private String employeeEmail;
     private  double   employeeMobile;
     private String  employeeDesignation;
     private boolean employeeGender;

    public Employee(Long employeeId, String employeeName, String employeeEmail, double employeeMobile, String employeeDesignation, boolean employeeGender) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeMobile = employeeMobile;
        this.employeeDesignation = employeeDesignation;
        this.employeeGender = employeeGender;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public double getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(double employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public boolean isEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(boolean employeeGender) {
        this.employeeGender = employeeGender;
    }
}
