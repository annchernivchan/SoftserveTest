package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** This controller class manages requests
 * and mapping it with html pages
 * */

@Controller
public class PageController {

    @GetMapping(value = "/")
    public String mainPage() { return "mainpage"; }

    @GetMapping(value = "/students")
    public String students() {
        return "students";
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses";
    }

}