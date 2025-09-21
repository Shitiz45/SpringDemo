package com.example.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

import com.example.rest.repository.EmployeeRepository;
import com.example.rest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

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
    public void deleteEmployeeById(Long empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public Employee updateEmployee(Long empId, Employee employee) {
        Employee empDB = employeeRepository.findById(empId).get();
        if (Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())) {
            empDB.setEmpName(employee.getEmpName());
        }

        if (Objects.nonNull(employee.getEmpDepartment()) && !"".equalsIgnoreCase(employee.getEmpDepartment())) {
            empDB.setEmpDepartment(employee.getEmpDepartment());
        }

        if (employee.getEmpSalary() != 0) {
            empDB.setEmpSalary(employee.getEmpSalary());
        }
        return employeeRepository.save(empDB);
    }

}
