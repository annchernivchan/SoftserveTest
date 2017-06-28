package example.dao.impl;

import example.dao.AbstractDao;
import example.dao.CourseDao;
import example.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl extends AbstractDao<Course> implements CourseDao {
}
