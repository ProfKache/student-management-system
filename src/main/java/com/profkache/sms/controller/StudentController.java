package com.profkache.sms.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.profkache.sms.entity.Student;
import com.profkache.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model) throws JsonProcessingException {
        List<Student> students = studentService.getAllStudents();
//        System.out.println("Students........." + new ObjectMapper().writeValueAsString(students));

        model.addAttribute("students", studentService.getAllStudents());

        // Return a view
        return "students";
    }
}
