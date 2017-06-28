package example.mapper;

import example.dto.CourseDto;
import example.model.Course;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {

    CourseMapper MAPPER = Mappers.getMapper(CourseMapper.class);

    CourseDto toDto(Course course);

    @InheritInverseConfiguration
    Course fromDto(CourseDto courseDto);

}
