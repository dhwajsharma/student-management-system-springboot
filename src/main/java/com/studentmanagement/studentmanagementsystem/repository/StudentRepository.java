package com.studentmanagement.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentmanagement.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
