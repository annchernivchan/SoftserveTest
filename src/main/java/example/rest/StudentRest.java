package example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentRest {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getStudents() {
        return "Success";
    }

}


