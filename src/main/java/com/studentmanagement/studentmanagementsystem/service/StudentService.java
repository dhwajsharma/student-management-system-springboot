package com.studentmanagement.studentmanagementsystem.service;

import java.util.List;

import com.studentmanagement.studentmanagementsystem.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);
}
