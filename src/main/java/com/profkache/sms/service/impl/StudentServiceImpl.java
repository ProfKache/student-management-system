package com.profkache.sms.service.impl;

import com.profkache.sms.entity.Student;
import com.profkache.sms.repository.StudentRepository;
import com.profkache.sms.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
