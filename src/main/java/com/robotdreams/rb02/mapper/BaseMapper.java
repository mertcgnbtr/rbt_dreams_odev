package com.robotdreams.rb02.mapper;

public interface BaseMapper<T, S> {
    T map(S model, Object... params);
}
