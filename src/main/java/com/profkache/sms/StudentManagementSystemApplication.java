package com.profkache.sms;

import com.profkache.sms.entity.Student;
import com.profkache.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		studentRepository.save(new Student("Salim", "Kachemela", "sakachemela@gmail.com"));
//		studentRepository.save(new Student("John", "Doe", "jdoe@gmail.com"));
//		studentRepository.save(new Student("Leonard", "Smith", "lsmith@gmail.com"));
	}
}
