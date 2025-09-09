package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Student {

    // attributes
    private int studentId;
    private String studentName;
    private int studentMarks;

    // constructor
    public Student() {
        System.out.println("Student object created");
    }

    // getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Autowired
    @Qualifier("B1")
    Book book;

    public void study() {
        System.out.println("Student is studying");
    }

    public void readBook() {
        book.read();
    }

}
