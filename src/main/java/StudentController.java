package src.main.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @PostMapping("/showStudent")
    public String showStudentList(){

        return  "students-list";
    }
}
