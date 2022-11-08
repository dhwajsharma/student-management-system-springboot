package com.studentmanagement.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentmanagement.studentmanagementsystem.entity.Student;
import com.studentmanagement.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Dhwaj", "Sharma", "dhwajsharma10@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Ramesh", "Sharma", "rameshsharma10@gmail.com");
		studentRepository.save(student2);

	}

}
