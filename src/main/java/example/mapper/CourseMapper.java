package example.mapper;

import example.dto.CourseDto;
import example.model.Course;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * This interface represents mapping entity {@code Course}
 * with Data Transfer Object (DTO) and vice versa
 */

@Mapper
public interface CourseMapper {

    CourseMapper MAPPER = Mappers.getMapper(CourseMapper.class);

    /**
     * This method converts entity {@code Course} to Data Transfer Object (DTO)
     *
     * @param course contains entity {@code Course} needs to be converted
     * @return DTO for entity {@code Course}
     */

    CourseDto toDto(Course course);


    /**
     * This method converts Data Transfer Object (DTO) to entity {@code Course}
     *
     * @param courseDto contains DTO needs to be converted
     * @return entity {@code Course}
     * *
     */

    @InheritInverseConfiguration
    Course fromDto(CourseDto courseDto);

}
