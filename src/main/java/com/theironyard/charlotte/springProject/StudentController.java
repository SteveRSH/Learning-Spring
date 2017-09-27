package com.theironyard.charlotte.springProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    List<Grade> grades = new ArrayList<>();
    @RequestMapping(path = "/new_student", method = RequestMethod.GET)
    public String getGrades(Model model){
        model.addAttribute("grades", Grade.values()); //passes in a model object
        return "new_student";
    }

    @RequestMapping(path = "/create_student", method = RequestMethod.POST)
    public String addStudent(Student student, Model model) {
        model.addAttribute("student", student);
        return "view_student";
    }
}
