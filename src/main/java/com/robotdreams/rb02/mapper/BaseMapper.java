package com.robotdreams.rb02.mapper;

import com.robotdreams.rb02.models.dto.StudentDTO;

public interface BaseMapper<T, S> {
    StudentDTO map(S model, Object... params);
}
