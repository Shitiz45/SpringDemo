package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.rest.service.EmployeeService;
import com.example.rest.entity.Employee;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public List<Employee> saveEmployee(@RequestBody List<Employee> employees) {
        System.out.println("Port 8082 is under operation.....");
        return employeeService.saveEmployee(employees);
    }

    @GetMapping("/employees/{id}")
    public Employee fetchEmployeesByID(@PathVariable("id") Long empId) {
        return employeeService.getEmployeeById(empId);
    }

}
