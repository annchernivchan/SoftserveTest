package example.mapper;

import example.dto.StudentDto;
import example.model.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CourseMapper.class)
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    StudentDto toDto(Student student);

    @InheritInverseConfiguration
    Student fromDto(StudentDto studentDto);

}
