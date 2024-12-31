package com.java8_Assignment.Spring.Boot.Project1.request;

import lombok.Data;

@Data
public class EmployeeRequest {
    private String employeeName;
    private String employeeEmail;
    private  Double   employeeMobile;
    private String  employeeDesignation;
    private boolean employeeGender;

//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public String getEmployeeEmail() {
//        return employeeEmail;
//    }
//
//    public void setEmployeeEmail(String employeeEmail) {
//        this.employeeEmail = employeeEmail;
//    }
//
//    public double getEmployeeMobile() {
//        return employeeMobile;
//    }
//
//    public void setEmployeeMobile(double employeeMobile) {
//        this.employeeMobile = employeeMobile;
//    }
//
//    public String getEmployeeDesignation() {
//        return employeeDesignation;
//    }
//
//    public void setEmployeeDesignation(String employeeDesignation) {
//        this.employeeDesignation = employeeDesignation;
//    }
//
//    public boolean isEmployeeGender() {
//        return employeeGender;
//    }
//
//    public void setEmployeeGender(boolean employeeGender) {
//        this.employeeGender = employeeGender;
//    }
}
