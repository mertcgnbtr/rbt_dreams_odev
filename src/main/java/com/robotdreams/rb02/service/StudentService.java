package com.robotdreams.rb02.service;

import com.robotdreams.rb02.models.Student;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAllStudents();

    Optional<Student> findById(Long id);

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

    void deleteStudentByAddress(String address);

}
