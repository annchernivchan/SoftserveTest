package example.rest;

import example.dto.StudentDto;
import example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This rest controller class manages requests
 * which starts with "/students"
 * and returns some data
 */

@RestController
@RequestMapping("/students")
public class StudentRest {

    @Autowired
    private StudentService studentService;

    /**
     * This method
     * @return list of all students at university
     */

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public ResponseEntity<List<StudentDto>> getStudents() {
        return ResponseEntity.ok(studentService.getAll());
    }

    /**
     * @param studentId contains student id
     * @return {@code StudentDto} object
     */

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    public ResponseEntity<StudentDto> getStudentById(@RequestParam(name = "studentId") String studentId) {
        return ResponseEntity.ok(studentService.getById(studentId));
    }

    /**
     * @param studentDto contains {@code StudentDto} object
     * @return true if object was created in database
     */

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ResponseEntity<Boolean> addStudent(@RequestBody StudentDto studentDto) {
        studentService.add(studentDto);
        return ResponseEntity.ok(true);
    }

}


