package example.service.impl;

import example.dao.CourseDao;
import example.dto.CourseDto;
import example.mapper.CourseMapper;
import example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Transactional
    public void add(CourseDto courseDto) {

    }

    @Transactional
    public void updateCourse(CourseDto courseDto) {

    }

    public List<CourseDto> getAll() {
        return courseDao
                .getAll()
                .stream()
                .map(CourseMapper.MAPPER::toDto)
                .collect(Collectors.toList());
    }
}
