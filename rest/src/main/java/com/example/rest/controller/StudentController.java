package com.example.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.rest.dto.StudentDTO;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDTO getStudent() {
        return new StudentDTO(1, "John Doe", 85);
    }

}
