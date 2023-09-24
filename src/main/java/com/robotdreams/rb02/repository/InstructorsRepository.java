package com.robotdreams.rb02.repository;

import com.robotdreams.rb02.models.Instructors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorsRepository extends JpaRepository<Instructors, Long> {
}
