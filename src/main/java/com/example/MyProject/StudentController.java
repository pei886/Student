package com.example.MyProject;

import com.example.MyProject.StudentService;
import com.example.MyProject.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getstudentinfo")
    public String getStudents() {
        return studentService.getstudents();
    }

    @PostMapping("/test")
    public String registerNewStudent(@RequestBody Students students) {
        studentService.registerNewStudent(students);
        return "Register successful";
    }

    @GetMapping("/login")
    public String login(@RequestParam String enteredPassword,
                        @RequestParam String enteredUsername){

        return studentService.login(enteredPassword,enteredUsername );

    }
}
