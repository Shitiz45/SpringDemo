package com.example.rest.service;

import com.example.rest.entity.Department;
import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentById();
}
