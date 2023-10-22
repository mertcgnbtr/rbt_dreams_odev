package com.robotdreams.rb02.mapper;

import com.robotdreams.rb02.models.Student;
import com.robotdreams.rb02.models.dto.StudentDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentDTOStudentEntityMapper implements BaseMapper<Student, StudentDTO> {
    @Override
    public StudentDTO map(StudentDTO entity, Object... params) {
        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setBirthDate(entity.getBirthDate());
        dto.setAddress(entity.getAddress());
        dto.setGender(entity.getGender());
        return entity;

    }
}
