package com.example.rest.service;

import com.example.rest.entity.Department;
import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> saveDepartments(List<Department> department);

    public List<Department> fetchDepartments();

    public Department getDepartmentById(Long deptId);

    public void deleteAllDepartments();

    public void deleteDepartmentById(Long deptId);

    public Department updateDepartmentById(Long deptId, Department department);
}
