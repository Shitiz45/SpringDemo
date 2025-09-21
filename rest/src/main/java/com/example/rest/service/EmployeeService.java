package com.example.rest.service;

import com.example.rest.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> saveEmployee(List<Employee> employees);

    public List<Employee> fetchEmployee();

    public Employee getEmployeeById(Long empId);

    public void deleteEmployeeById(Long empId);

    public Employee updateEmployee(Long empId, Employee employee);
}
