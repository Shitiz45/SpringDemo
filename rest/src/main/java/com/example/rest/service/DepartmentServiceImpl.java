package com.example.rest.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rest.entity.Department;
import com.example.rest.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> saveDepartments(List<Department> departments) {
        return departmentRepository.saveAll(departments);
    }

    @Override
    public List<Department> fetchDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long deptId) {
        return departmentRepository.findById(deptId).orElse(null);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.getDepartmentByDepartmentName(departmentName);
    }

    @Override
    public void deleteAllDepartments() {
        departmentRepository.deleteAll();
    }

    @Override
    public void deleteDepartmentById(Long deptId) {
        departmentRepository.deleteById(deptId);
    }

    @Override
    public Department updateDepartmentById(Long deptId, Department department) {
        Department DBdept = departmentRepository.findById(deptId).get();

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            DBdept.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            DBdept.setDepartmentCode(department.getDepartmentCode());
        }

        if (Objects.nonNull(department.getDepartmentAddress())
                && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            DBdept.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(DBdept);
    }
}
