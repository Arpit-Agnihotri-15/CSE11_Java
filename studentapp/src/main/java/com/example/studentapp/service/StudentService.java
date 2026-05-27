package com.example.studentapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentapp.model.Student;

@Service
public class StudentService {

    private List<Student> studentList = new ArrayList<>();

    // Add Student
    public String addStudent(Student student) {
        studentList.add(student);
        return "Student added successfully";
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return studentList;
    }

    // Get Student by ID
    public Student getStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update Student
    public String updateStudent(Student student) {
        for (Student s : studentList) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                s.setAge(student.getAge());
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }

    // Delete Student
    public String deleteStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                return "Student deleted successfully";
            }
        }
        return "Student not found";
    }
}