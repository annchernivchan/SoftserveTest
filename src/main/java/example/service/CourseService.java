package example.service;

import example.dto.CourseDto;
import example.model.Course;

import java.util.List;

public interface CourseService {

    void add(CourseDto courseDto);
    void updateCourse(CourseDto courseDto);
    CourseDto getById(String courseId);
    List<CourseDto> getAll();

}
