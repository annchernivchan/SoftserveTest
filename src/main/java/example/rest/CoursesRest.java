package example.rest;

import example.dto.CourseDto;
import example.dto.StudentDto;
import example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This rest controller class manages requests
 * which starts with "/courses"
 * and returns some data
 */

@RestController
@RequestMapping("/courses")
public class CoursesRest {

    @Autowired
    private CourseService courseService;

    /**
     * This method
     * @return list of all courses at university
     */

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public ResponseEntity<List<CourseDto>> getCourses() {
        return ResponseEntity.ok(courseService.getAll());
    }

    /**
     * @param courseId contains course id
     * @return {@code CourseDto} object
     */

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    public ResponseEntity<CourseDto> getStudentById(@RequestParam(name = "courseId") String courseId) {
        return ResponseEntity.ok(courseService.getById(courseId));
    }

    /**
     * @param courseDto contains {@code CourseDto} object
     * @return true if object was created in database
     */

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ResponseEntity<Boolean> addStudent(@RequestBody CourseDto courseDto) {
        courseService.add(courseDto);
        return ResponseEntity.ok(true);
    }

}
