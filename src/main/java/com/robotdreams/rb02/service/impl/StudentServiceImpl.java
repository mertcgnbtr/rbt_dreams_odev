package com.robotdreams.rb02.service.impl;

import com.robotdreams.rb02.exception.StudentNotFoundException;
import com.robotdreams.rb02.models.Student;
import com.robotdreams.rb02.repository.StudentRepository;
import com.robotdreams.rb02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with ID : " + id)));
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void deleteStudentByAddress(String address) {
        studentRepository.deleteByAddress(address);
    }
}
