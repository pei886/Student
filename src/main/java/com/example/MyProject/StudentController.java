package com.example.MyProject;

import com.example.MyProject.StudentService;
import com.example.MyProject.model.Course;
import com.example.MyProject.model.Students;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getstudentinfo")
    public String getStudents() {
        return studentService.getstudents();
    }

    @PostMapping("/register")
    public String registerNewStudent(@RequestBody Students students) {
        studentService.registerNewStudent(students);
        return "Register successful";
    }

    @GetMapping("/login")
    public boolean login(@RequestParam String enteredPassword,
                        @RequestParam String enteredUsername){

        return studentService.login(enteredPassword,enteredUsername);

    }

    @GetMapping("/getcourseinfo")
    public String getcourseinfo(@RequestParam String enteredUsername){
        return studentService.getAllCourses(enteredUsername);
    }

    @PostMapping("/registercourses")
    public String registerCourses(@RequestBody Course course){
        studentService.registerCourses(course);
        return "Register successful";
    }
}
