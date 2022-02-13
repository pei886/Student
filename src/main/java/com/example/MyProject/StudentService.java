package com.example.MyProject;

import com.example.MyProject.StudentRowMapper;
import com.example.MyProject.StudentRepository;
import com.example.MyProject.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.MyProject.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    public String getstudents() {
        List<Students> student= jdbcTemplate.query("select * from students", new StudentRowMapper());
        return student.toString();
    }

    public Students registerNewStudent(Students students) {

        return studentRepository.save(students);
    }

    public boolean login(String enterPassword, String enterUsername) {
        String sql = "select password from students Where username = '" + enterUsername + "'";
        String sqlexists = "SELECT EXISTS(SELECT FROM students WHERE username = ?)";

        if (! jdbcTemplate.queryForObject(sqlexists, Boolean.class, enterUsername)){
            return false;
        }
        Students students = jdbcTemplate.queryForObject(sql, new PasswordRowMapper());
        if (enterPassword.equals(students.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }

    public String getAllCourses(String enterUsername){
        String sql = "select course_name, teacher_name from course where student_name = '" + enterUsername + "'";
        List<Course> courses = jdbcTemplate.query(sql, new CourseRowMapper());
        return courses.toString();
    }

    public Course registerCourses(Course course){
        return courseRepository.save(course);

    }
}
//jdbcTemplate.execute("insert into students (username, password, full_name, dob, age, gender, address)\n" +
//        "values ('usernumber2', '743832', 'User Wong', '2004-04-23', 17, 'M', 'Mangis Road')");