package com.project.api.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.api.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
