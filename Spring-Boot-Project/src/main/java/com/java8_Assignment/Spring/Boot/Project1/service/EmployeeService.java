package com.java8_Assignment.Spring.Boot.Project1.service;

import com.java8_Assignment.Spring.Boot.Project1.model.Employee;
import com.java8_Assignment.Spring.Boot.Project1.repository.EmployeeRepository;
import com.java8_Assignment.Spring.Boot.Project1.request.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    // Employee employee1 =
    }

    public Employee getEmployee(@PathVariable Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("employeeid not found"));
    }

    public String deleteById(Long employeeId) {
        Employee entity = employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("employee not found"));
        employeeRepository.delete(entity);
        return "Deleted successfully";
    }
//OR
//    public void deleteById(Long employeeId) {
//        Employee entity = employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("employee not found"));
//        employeeRepository.delete(entity);
//    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void updateById(Long employeeId, EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("employeeId not found"));
        if (employeeRequest.getEmployeeDesignation() != null) {
            employee.setEmployeeDesignation(employeeRequest.getEmployeeDesignation());
        }
        if (employeeRequest.getEmployeeEmail() != null) {employee.setEmployeeEmail(employeeRequest.getEmployeeEmail());
        }
        if (employeeRequest.getEmployeeMobile() != null) {
            employee.setEmployeeMobile(employeeRequest.getEmployeeMobile());
        }
        if (employeeRequest.getEmployeeName() != null) {
            employee.setEmployeeName(employeeRequest.getEmployeeName());
        }
//if(employeeRequest.isEmployeeGender()=false){
//    employee.isEmployeeGender(employeeRequest.isEmployeeGender());
//}
        employeeRepository.save(employee);
    }
}