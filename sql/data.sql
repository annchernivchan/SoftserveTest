INSERT INTO courses (id, name) VALUES
  ('11', 'Math'),
  ('22', 'Biology');

INSERT INTO students (id, name) VALUES
  ('111', 'Emilia Jackson'),
  ('222', 'Matt Lewiss'),
  ('333', 'Tom Rubber');

INSERT INTO student_course (student_id, course_id) VALUES
  ('111', '11'),
  ('111', '22'),
  ('222', '11'),
  ('333', '22');