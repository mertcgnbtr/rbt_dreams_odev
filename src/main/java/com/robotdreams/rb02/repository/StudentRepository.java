package com.robotdreams.rb02.repository;

import com.robotdreams.rb02.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student deleteByAddress(String address);
}
