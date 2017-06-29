package example.service.impl;

import example.dao.CourseDao;
import example.dto.CourseDto;
import example.mapper.CourseMapper;
import example.model.Course;
import example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class provides work with {@code Course} entity
 * on Data Access Object (DAO) layer
 * */

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Transactional
    public void add(CourseDto courseDto) {
        courseDao.create(CourseMapper.MAPPER.fromDto(courseDto));
    }

    @Transactional
    public void updateCourse(CourseDto courseDto) {
        courseDao.update(CourseMapper.MAPPER.fromDto(courseDto));
    }

    public CourseDto getById(String courseId) {
        Course byId = courseDao.getById(courseId);
        return CourseMapper.MAPPER.toDto(byId);
    }

    public List<CourseDto> getAll() {
        return courseDao
                .getAll()
                .stream()
                .map(CourseMapper.MAPPER::toDto)
                .collect(Collectors.toList());
    }
}
