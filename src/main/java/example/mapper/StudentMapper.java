package example.mapper;

import example.dto.StudentDto;
import example.model.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * This interface represents mapping entity {@code Student}
 * with Data Transfer Object (DTO) and vice versa
 */

@Mapper(uses = CourseMapper.class)
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    /**
     * This method converts entity {@code Student} to Data Transfer Object (DTO)
     *
     * @param student contains entity {@code Student} needs to be converted
     * @return DTO for entity {@code Student}
     */

    StudentDto toDto(Student student);

    /**
     * This method converts Data Transfer Object (DTO) to entity {@code Student}
     *
     * @param studentDto contains DTO needs to be converted
     * @return entity {@code Student}
     * *
     */

    @InheritInverseConfiguration
    Student fromDto(StudentDto studentDto);

}
