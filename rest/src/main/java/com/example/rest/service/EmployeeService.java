package com.example.rest.service;

import com.example.rest.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> saveEmployee(List<Employee> employees);

    List<Employee> fetchEmployee();

    Employee getEmployeeById(Long empId);

    String deleteEmployeeById(Long empId);
}
