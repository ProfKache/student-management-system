package com.profkache.sms.controller;

import com.profkache.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public String list_students(Model model) {
        model.addAttribute("students", studentService.getAllStudents());

        // Return a view
        return "students";
    }
}
