package com.project.api.service;

import org.springframework.stereotype.Service;
import com.project.api.repository.StudentRepository;
import com.project.api.entity.Student;
import lombok.RequiredArgsConstructor;
import java.util.stream.Collectors;
import com.project.api.dto.StudentDTO;
import com.project.api.dto.AddStudentsDTO;
import java.util.List;
import org.modelmapper.ModelMapper;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> fetchStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(s -> new StudentDTO(
                s.getStudentID(),
                s.getStudentName(),
                s.getStudentMarks())).collect(Collectors.toList());
    }

    @Override
    public StudentDTO fetchStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student with ID " + id + " not found"));
        return modelMapper.map(student, StudentDTO.class);

    }

    @Override
    public StudentDTO createNewStudent(AddStudentsDTO addStudentsDTO) {
        Student newStudent = modelMapper.map(addStudentsDTO, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> createMultipleStudents(List<AddStudentsDTO> addStudentsDTO) {
        List<Student> newStudents = addStudentsDTO.stream()
                .map(dto -> modelMapper.map(dto, Student.class))
                .collect(Collectors.toList());
        List<Student> savedStudents = studentRepository.saveAll(newStudents);
        return savedStudents.stream()
                .map(student -> modelMapper.map(student, StudentDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteStudentByID(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new IllegalArgumentException("Student with ID " + id + " not found");
        }
        studentRepository.deleteById(id);
    }
}
