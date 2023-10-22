package com.robotdreams.rb02.models.dto;
import lombok.*;
import java.util.Set;


import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private long id;
    private String name;
    private Date birthDate;
    private String address;
    private String gender;
    private Set<CourseDTO> courses;


}
