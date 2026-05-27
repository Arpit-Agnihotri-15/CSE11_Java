package com.example.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.studentapp.model.Student;
import com.example.studentapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add Student
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Get All Students
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get Student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // Update Student
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    // Delete Student
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}