package com.robotdreams.rb02.controller;

import com.robotdreams.rb02.models.Student;
import com.robotdreams.rb02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentService studentServiceImpl;

    @Autowired
    public StudentController(StudentService studentServiceImpl){
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentServiceImpl.findAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable long id) {
        return studentServiceImpl.findById(id);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentServiceImpl.saveStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentServiceImpl.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable long id){
        studentServiceImpl.deleteStudentById(id);
    }

    @DeleteMapping("/students/{address}")
    public void deleteStudentByAddress(@PathVariable String address){
        studentServiceImpl.deleteStudentByAddress(address);
    }

}
