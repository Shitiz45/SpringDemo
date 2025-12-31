package com.project.api.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.project.api.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;
import com.project.api.dto.StudentDTO;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDTO> fetchStudents() {
        return studentService.fetchStudents();
    }
}
