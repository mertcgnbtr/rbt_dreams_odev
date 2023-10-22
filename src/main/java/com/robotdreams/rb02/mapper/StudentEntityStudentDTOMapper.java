package com.robotdreams.rb02.mapper;

import com.robotdreams.rb02.models.Student;
import com.robotdreams.rb02.models.dto.StudentDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentEntityStudentDTOMapper implements BaseMapper<StudentDTO, Student> {
    public StudentDTO map(Student dto, Object... params) {
        Student entity = new Student();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setBirthDate(dto.getBirthDate());
        entity.setAddress(dto.getAddress());
        entity.setGender(dto.getGender());
        return entity;
    }

}
