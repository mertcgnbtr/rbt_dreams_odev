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

        Student student1 = new Student("Ali", new Date(), "Ankara", "Erkek");
        Student student2 = new Student("Veli", new Date(), "Ankara", "Erkek");
        Student student3 = new Student("Mehmet", new Date(), "Ankara", "Erkek");

        Course course1 = new Course("Matematik", "Math101", "50");
        Course course2 = new Course("Fizik", "Math101", "50");
        Course course3 = new Course("Kimya", "Math101", "50");

        Instructors visitingResearcher1 = new VisitingResearcher(5.5);
        Instructors visitingResearcher2 = new VisitingResearcher(7.5);
        Instructors permanentResearcher1 = new PermanentResearcher(10.0);
        Instructors permanentResearcher2 = new PermanentResearcher(10.3);

        student1.setCourseList((Set<Course>) course1);
        student2.setCourseList((Set<Course>) course2);
        visitingResearcher1.setCourseList((List<Course>) course1);
        permanentResearcher1.setCourseList((List<Course>) course2);

        visitingResearcher1.getCourseList().add(course1);
        permanentResearcher1.getCourseList().add(course2);





        System.out.println("Finish....");





    }
}
