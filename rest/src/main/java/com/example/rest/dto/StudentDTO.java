package com.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {
    private int StudentId;
    private String StudentName;
    private int StudentMarks;
}
