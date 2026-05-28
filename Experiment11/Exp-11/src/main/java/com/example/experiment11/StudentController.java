package com.example.experiment11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(101, "Arpit", "CSE"));
        students.add(new Student(102, "Rahul", "IT"));
    }

    // Welcome API
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Student Management REST API";
    }

    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }

    // Get one student by id
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    // Add student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {

        students.add(student);

        return student;
    }

    // Update student
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestBody Student updatedStudent) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setName(updatedStudent.getName());
                s.setCourse(updatedStudent.getCourse());

                return s;
            }
        }

        return null;
    }

    // Delete student
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        for (Student s : students) {

            if (s.getId() == id) {

                students.remove(s);

                return "Student deleted successfully";
            }
        }

        return "Student not found";
    }
}