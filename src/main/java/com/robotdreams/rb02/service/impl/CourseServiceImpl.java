package com.robotdreams.rb02.service.impl;

import com.robotdreams.rb02.exception.CourseNotFoundException;
import com.robotdreams.rb02.models.Course;
import com.robotdreams.rb02.repository.CourseRepository;
import com.robotdreams.rb02.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> findById(Long id) {
        return Optional.ofNullable(courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException("Course not found with ID : " + id)));
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void deleteCourseByCourseCode(String courseCode) {
        courseRepository.deleteCourseByCourseCode(courseCode);
    }
}
