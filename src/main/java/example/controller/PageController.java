package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value = "/books")
    public String books() {
        return "courses";
    }

    @GetMapping("/authors")
    public String authors() {
        return "students";
    }

}