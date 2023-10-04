package com.robotdreams.rb02.controller;

import com.robotdreams.rb02.models.Course;
import com.robotdreams.rb02.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    private final CourseService courseServiceImpl;

    @Autowired
    public CourseController(CourseService courseServiceImpl){
        this.courseServiceImpl = courseServiceImpl;
    }

    @GetMapping("/courses")
    public List<Course> findAllCourses(){
        return courseServiceImpl.findAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> findCourseById(@PathVariable Long id){
        return courseServiceImpl.findById(id);
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course){
        return courseServiceImpl.saveCourse(course);

    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course){
        return courseServiceImpl.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourseById(@PathVariable long id){
        courseServiceImpl.deleteById(id);
    }

    @DeleteMapping("/courses/{coursecode}")
    public void deleteCourseByCourseCode(@PathVariable("coursecode") String courseCode){
        courseServiceImpl.deleteCourseByCourseCode(courseCode);
    }


}
