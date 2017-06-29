package example.service.impl;

import example.dao.StudentDao;
import example.dto.StudentDto;
import example.mapper.StudentMapper;
import example.model.Student;
import example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class provides work with {@code Student} entity
 * on Data Access Object (DAO) layer
 * */

@Service
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void add(StudentDto studentDto) {
        studentDao.create(StudentMapper.MAPPER.fromDto(studentDto));
    }

    @Transactional
    public void update(StudentDto studentDto) {
        studentDao.update(StudentMapper.MAPPER.fromDto(studentDto));
    }

    public StudentDto getById(String studentId) {
        return StudentMapper.MAPPER.toDto(studentDao.getById(studentId));
    }

    public List<StudentDto> getAll() {
        return studentDao
                .getAll()
                .stream()
                .map(StudentMapper.MAPPER::toDto)
                .collect(Collectors.toList());
    }
}
