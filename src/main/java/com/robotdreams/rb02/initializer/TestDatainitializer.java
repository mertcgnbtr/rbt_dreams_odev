package com.robotdreams.rb02.initializer;

import com.robotdreams.rb02.repository.CourseRepository;
import com.robotdreams.rb02.repository.InstructorsRepository;
import com.robotdreams.rb02.repository.StudentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.transaction.annotation.Transactional;
import com.robotdreams.rb02.models.*;


import java.util.Date;
import java.util.List;
import java.util.Set;

public class TestDatainitializer implements ApplicationRunner {

    private final CourseRepository courseRepository;
    private final InstructorsRepository instructorsRepository;
    private final StudentRepository studentRepository;

    public TestDatainitializer (CourseRepository courseRepository, InstructorsRepository instructorsRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.instructorsRepository = instructorsRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Start....");

        Student student1 = new Student("John Doe", new Date(), "123 Main St", "Male");
        Student student2 = new Student("Jane Smith", new Date(), "456 Elm St", "Female");

        Course course1 = new Course("Math 101", "MATH101", "3");
        Course course2 = new Course("Physics 202", "PHYS202", "4");

        PermanentResearcher researcher1 = new PermanentResearcher("Dr. Smith", "789 Oak St", "555-1234", 60000.0);
        PermanentResearcher researcher2 = new PermanentResearcher("Dr. Johnson", "987 Maple St", "555-5678", 70000.0);

        VisitingResearcher visitor1 = new VisitingResearcher("Prof. Brown", "567 Pine St", "555-4321", 50.0);
        VisitingResearcher visitor2 = new VisitingResearcher("Prof. Davis", "654 Birch St", "555-8765", 55.0);

        student1.getCourseList().add(course1);
        student1.getCourseList().add(course2);
        student2.getCourseList().add(course1);

        course1.getStudents().add(student1);
        course1.getStudents().add(student2);
        course2.getStudents().add(student1);


        researcher1.getCourseList().add(course1);
        visitor1.getCourseList().add(course2);


        System.out.println("Finish....");





    }
}
