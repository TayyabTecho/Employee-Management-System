package com.java8_Assignment.Spring.Boot.Project1.controller;

import com.java8_Assignment.Spring.Boot.Project1.model.Employee;
import com.java8_Assignment.Spring.Boot.Project1.request.EmployeeRequest;
import com.java8_Assignment.Spring.Boot.Project1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @GetMapping("/findEmployeeById/{employeeId}")
    public Employee findEmployeeById(@PathVariable Long employeeId) {
        Employee employee1 = employeeService.getEmployee(employeeId);
        return employee1;
    }

    @PutMapping("/updateById/{employeeId}")
    public void updateById(@PathVariable Long employeeId, @RequestBody EmployeeRequest employeeRequest) {
        employeeService.updateById(employeeId, employeeRequest);
    }

    @GetMapping("/")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PutMapping("/updateById/{employeeId}")
    public void updateById(@RequestBody EmployeeRequest employeeRequest, @PathVariable Long employeeId) {
        employeeService.updateById(employeeId, employeeRequest);
    }

    @DeleteMapping("/{employeeId}")
    public String deleteById(@PathVariable Long employeeId) {
        //service.deleteById(userId);
       return employeeService.deleteById(employeeId);
    }

//    @DeleteMapping("/{employeeId")
//    public void deleteById(@PathVariable Long employeeId) {
//employeeService.deleteById(employeeId);
//    }

}