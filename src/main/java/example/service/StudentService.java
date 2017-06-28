package example.service;

import example.dto.StudentDto;
import example.model.Student;

import java.util.List;

public interface StudentService {

    void add(StudentDto studentDto);
    void update(StudentDto studentDto);
    List<StudentDto> getAll();

}
