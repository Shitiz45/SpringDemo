package com.project.api.service;

import org.springframework.stereotype.Service;
import com.project.api.repository.StudentRepository;
import com.project.api.entity.Student;
import lombok.RequiredArgsConstructor;
import java.util.stream.Collectors;
import com.project.api.dto.StudentDTO;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDTO> fetchStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(student -> new StudentDTO(
                student.getStudentID(),
                student.getStudentName(),
                student.getStudentMarks())).collect(Collectors.toList());
    }
}
