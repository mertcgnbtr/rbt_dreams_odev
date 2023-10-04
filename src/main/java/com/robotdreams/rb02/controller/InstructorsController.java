package com.robotdreams.rb02.controller;

import com.robotdreams.rb02.models.Instructors;
import com.robotdreams.rb02.service.InstructorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InstructorsController {

    private final InstructorsService instructorsServiceImpl;

    @Autowired
    public InstructorsController(InstructorsService instructorsServiceImpl){
        this.instructorsServiceImpl = instructorsServiceImpl;
    }

    @GetMapping("/instructors")
    public List<Instructors> findAllInstructors(){
        return instructorsServiceImpl.findAllInstructors();
    }

    @GetMapping("/instructors/{id}")
    public Optional<Instructors> findInstructorsById(@PathVariable Long id){
        return instructorsServiceImpl.findById(id);
    }

    @PostMapping
    public Instructors saveInstructors(@RequestBody Instructors instructors){
        return instructorsServiceImpl.saveInstructors(instructors);

    }

    @PutMapping
    public Instructors updateInstructors(@RequestBody Instructors instructors){
        return instructorsServiceImpl.updateInstructors(instructors);
    }

    @DeleteMapping("/instructors/{id}")
    public void deleteInstructorsById(@PathVariable long id){
        instructorsServiceImpl.deleteById(id);
    }

    @DeleteMapping("/instructors/{phonenumber}")
    public void deleteInstructorsByInstructorsCode(@PathVariable("phonenumber") String phoneNumber){
        instructorsServiceImpl.deleteByPhoneNumber(phoneNumber);
    }
    
}
