package example.dao.impl;

import example.dao.AbstractDao;
import example.dao.StudentDao;
import example.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends AbstractDao<Student> implements StudentDao {
}
