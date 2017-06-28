package example.service;

import example.dto.CourseDto;

import java.util.List;

public interface CourseService {

    void add(CourseDto courseDto);
    void updateCourse(CourseDto courseDto);
    List<CourseDto> getAll();

}
