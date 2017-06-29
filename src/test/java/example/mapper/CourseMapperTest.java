package example.mapper;

import example.dto.CourseDto;
import example.model.Course;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CourseMapperTest {

    /**
     * This method checks if converting from entity {@code Course} to
     * DTO {@code CourseDto} is correct
     */

    @Test
    public void isMappingToDtoCorrectTest() {
        Course course = new Course();
        course.setId("010101");
        course.setName("Math");

        CourseDto courseDto = CourseMapper.MAPPER.toDto(course);

        Assert.assertEquals(courseDto.getId(), course.getId());
        Assert.assertEquals(courseDto.getName(), course.getName());
    }

    /**
     * This method checks if converting from DTO {@code CourseDto} to
     * entity {@code Course} is correct
     */

    @Test
    public void isMappingFromDtoCorrectTest() {
        CourseDto courseDto = new CourseDto();
        courseDto.setId("010101");
        courseDto.setName("John Smith");

        Course course = CourseMapper.MAPPER.fromDto(courseDto);

        Assert.assertEquals(course.getId(), courseDto.getId());
        Assert.assertEquals(course.getName(), courseDto.getName());
    }

}
