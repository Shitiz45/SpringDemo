package com.example.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.rest.repository.EmployeeRepository;
import com.example.rest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> saveEmployee(List<Employee> employees) {
        employees = employeeRepository.saveAll(employees);
        return employees;
    }

    @Override
    public List<Employee> fetchEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long empId) {
        return employeeRepository.findById(empId).orElse(null);
    }

    @Override
    public String deleteEmployeeById(Long empId) {
        employeeRepository.deleteById(empId);
        return "Employee deleted successfully";
    }

}
