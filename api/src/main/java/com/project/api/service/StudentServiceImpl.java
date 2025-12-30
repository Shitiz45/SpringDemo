package com.project.api.service;

import org.springframework.stereotype.Service;
import com.project.api.service.StudentService;
import com.project.api.repository.StudentRepository;
import com.project.api.entity.Student;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> fetchStudents() {
        return studentRepository.findAll();
    }
}
