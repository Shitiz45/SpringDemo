package com.project.api.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddStudentsDTO {
    @NotBlank
    private String studentName;

    @Min(0)
    @Max(100)
    private double studentMarks;
}
