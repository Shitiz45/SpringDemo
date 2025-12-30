package com.project.api.service;

import java.util.List;
import com.project.api.entity.Student;

public interface StudentService {
    List<Student> fetchStudents();
}
