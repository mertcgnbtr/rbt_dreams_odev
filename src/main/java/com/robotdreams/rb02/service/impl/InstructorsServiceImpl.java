package com.robotdreams.rb02.service.impl;

import com.robotdreams.rb02.exception.CourseNotFoundException;
import com.robotdreams.rb02.exception.InstructorsNotFoundException;
import com.robotdreams.rb02.models.Instructors;
import com.robotdreams.rb02.repository.InstructorsRepository;
import com.robotdreams.rb02.service.InstructorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorsServiceImpl implements InstructorsService {

    private final InstructorsRepository instructorsRepository;

    @Autowired
    public  InstructorsServiceImpl(InstructorsRepository instructorsRepository){
        this.instructorsRepository = instructorsRepository;
    }

    @Override
    public List<Instructors> findAllInstructors() {
        return instructorsRepository.findAll();
    }

    @Override
    public Optional<Instructors> findById(Long id) {
        return Optional.ofNullable(instructorsRepository.findById(id).orElseThrow(() -> new InstructorsNotFoundException("Instructors not found with ID : " + id)));
    }


    @Override
    public Instructors saveInstructors(Instructors instructors) {
        return instructorsRepository.save(instructors);
    }

    @Override
    public Instructors updateInstructors(Instructors instructors) {
        return instructorsRepository.save(instructors);
    }

    @Override
    public void deleteById(Long id) {
        instructorsRepository.deleteById(id);
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {
        instructorsRepository.deleteInstructorsByPhoneNumber(phoneNumber);
    }
}
