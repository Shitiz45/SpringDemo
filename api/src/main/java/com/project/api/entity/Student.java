package com.project.api.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private String studentName;
    private double studentMarks;

}
