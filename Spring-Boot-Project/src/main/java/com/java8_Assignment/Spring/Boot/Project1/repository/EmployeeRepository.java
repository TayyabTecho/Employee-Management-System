package com.java8_Assignment.Spring.Boot.Project1.repository;

//import org.springframework.web.bind.annotation.RestController;

import com.java8_Assignment.Spring.Boot.Project1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
