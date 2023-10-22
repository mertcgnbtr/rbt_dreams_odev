package com.robotdreams.rb02.models.dto;

import com.robotdreams.rb02.models.enums.InstructorsType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseDTO {

    private Long id;
    private String courseName;
    private String courseCode;
    private String creditScore;
    private InstructorsType instructorsType;

}
