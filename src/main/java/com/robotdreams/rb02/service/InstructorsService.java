package com.robotdreams.rb02.service;

import com.robotdreams.rb02.models.Instructors;

import java.util.List;
import java.util.Optional;

public interface InstructorsService {

    List<Instructors> findAllInstructors();

    Optional<Instructors> findById(Long id);

    Instructors saveInstructors(Instructors instructors);

    Instructors updateInstructors(Instructors instructors);

    void deleteById(Long id);

    void deleteByPhoneNumber(String phoneNumber);

}
