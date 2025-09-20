package com.example.rest.service;

import com.example.rest.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> saveEmployee(List<Employee> employees);

    Employee getEmployeeById(Long empId);
}
