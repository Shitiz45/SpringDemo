package com.example.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long managerId;
    private String managerName;
    private String managerDepartment;
}
