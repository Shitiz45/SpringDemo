package com.project.api.dto;

import lombok.*;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Long studentID;

    @NotBlank
    private String studentName;

    @Min(0)
    @Max(100)
    private double studentMarks;
}
