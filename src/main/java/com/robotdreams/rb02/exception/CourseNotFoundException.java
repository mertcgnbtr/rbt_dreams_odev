package com.robotdreams.rb02.exception;

public class CourseNotFoundException extends RuntimeException {

    public CourseNotFoundException (String message) {
        super(message);
    }
}
