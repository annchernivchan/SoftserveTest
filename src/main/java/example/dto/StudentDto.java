package example.dto;

import java.util.List;

/**
 * This class represents Data Transfer Object of @Student entity
 */


public class StudentDto {

    private String id;
    private String name;
    private List<CourseDto> courses;

    public StudentDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }
}
