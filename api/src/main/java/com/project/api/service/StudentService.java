package com.project.api.service;

import java.util.List;
import com.project.api.dto.StudentDTO;
import com.project.api.dto.AddStudentsDTO;

public interface StudentService {
    List<StudentDTO> fetchStudents();

    StudentDTO fetchStudentById(Long id);

    StudentDTO createNewStudent(AddStudentsDTO addStudentsDTO);

    List<StudentDTO> createMultipleStudents(List<AddStudentsDTO> addStudentsDTO);
}
