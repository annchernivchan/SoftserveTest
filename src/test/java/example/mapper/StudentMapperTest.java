package example.mapper;

import example.dto.CourseDto;
import example.dto.StudentDto;
import example.model.Course;
import example.model.Student;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentMapperTest {

    /**
     * This method checks if converting from entity @Student to
     * DTO @StudentDto is correct
     */

    @Test
    public void isMappingToDtoCorrectTest() {
        Student student = new Student();
        student.setId("010101");
        student.setName("John Smith");
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Chemistry"));
        courses.add(new Course("Music"));
        student.setCourses(courses);

        StudentDto studentDto = StudentMapper.MAPPER.toDto(student);

        Assert.assertEquals(studentDto.getId(), student.getId());
        Assert.assertEquals(studentDto.getName(), student.getName());
        Assert.assertEquals(studentDto.getCourses().get(0).getName(), student.getCourses().get(0).getName());
    }

    /**
     * This method checks if converting from DTO @StudentDto to
     * entity @Student is correct
     */

    @Test
    public void isMappingFromDtoCorrectTest() {
        StudentDto studentDto = new StudentDto();
        studentDto.setId("010101");
        studentDto.setName("John Smith");
        List<CourseDto> courses = new ArrayList<>();
        courses.add(new CourseDto("Chemistry"));
        courses.add(new CourseDto("Music"));
        studentDto.setCourses(courses);

        Student student = StudentMapper.MAPPER.fromDto(studentDto);

        Assert.assertEquals(student.getId(), studentDto.getId());
        Assert.assertEquals(student.getName(), studentDto.getName());
        Assert.assertEquals(student.getCourses().get(0).getName(), studentDto.getCourses().get(0).getName());
    }

}
