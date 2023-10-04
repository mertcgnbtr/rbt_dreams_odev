package com.robotdreams.rb02.service;

import com.robotdreams.rb02.models.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    List<Course> findAllCourses();

    Optional<Course> findById(Long id);

    Course saveCourse(Course course);

    Course updateCourse(Course course);

    void deleteById(Long id);

    void deleteCourseByCourseCode(String courseCode);

}
