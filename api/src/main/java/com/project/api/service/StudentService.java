package com.project.api.service;

import java.util.List;
import com.project.api.dto.StudentDTO;

public interface StudentService {
    List<StudentDTO> fetchStudents();
}
