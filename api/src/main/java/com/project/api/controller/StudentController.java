package com.project.api.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.project.api.service.StudentService;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;

import com.project.api.dto.AddStudentsDTO;
import com.project.api.dto.StudentDTO;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> fetchStudents() {
        return ResponseEntity.ok(studentService.fetchStudents());
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDTO> fetchStudentsById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.fetchStudentById(id));
    }

    @PostMapping("/")
    public ResponseEntity<StudentDTO> createNewStudent(@RequestBody AddStudentsDTO addStudentsDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentsDTO));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<StudentDTO>> createMultipleStudent(@RequestBody List<AddStudentsDTO> addStudentsDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createMultipleStudents(addStudentsDTO));
    }
}
