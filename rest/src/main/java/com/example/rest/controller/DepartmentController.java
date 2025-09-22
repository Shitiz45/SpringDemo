package com.example.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.rest.entity.Department;
import com.example.rest.service.DepartmentService;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @PostMapping("/department/batch")
    public List<Department> saveDepartments(@RequestBody List<Department> department) {
        return departmentService.saveDepartments(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartment() {
        return departmentService.fetchDepartments();
    }

    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long deptId) {
        return departmentService.getDepartmentById(deptId);
    }

    @DeleteMapping("/department")
    public String deleteDepartments() {
        departmentService.deleteAllDepartments();
        return "Deleted All Departments";
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long deptId) {
        departmentService.deleteDepartmentById(deptId);
        return "Deleted Department with ID: " + deptId;
    }

    @PutMapping("/department/{deptId}")
    public Department updateDepartmentById(@PathVariable Long deptId, @RequestBody Department department) {
        return departmentService.updateDepartmentById(deptId, department);
    }

}
