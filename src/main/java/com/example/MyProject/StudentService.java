package com.example.MyProject;

import com.example.MyProject.StudentRowMapper;
import com.example.MyProject.StudentRepository;
import com.example.MyProject.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

    public String getstudents() {
        List<Students> student= jdbcTemplate.query("select * from students", new StudentRowMapper());
        return student.toString();
    }

    public Students registerNewStudent(Students students) {
        return studentRepository.save(students);
    }

    public String login(String enterPassword, String enterUsername) {
        String sql = "select password from students Where username = '" + enterUsername + "'";
        Students students = jdbcTemplate.queryForObject(sql, new PasswordRowMapper());
        if (enterPassword.equals(students.getPassword())){
            return "Login Successful!";
        }
        else{
            return "Oops, something went wrong...";
        }

    }
}
//jdbcTemplate.execute("insert into students (username, password, full_name, dob, age, gender, address)\n" +
//        "values ('usernumber2', '743832', 'User Wong', '2004-04-23', 17, 'M', 'Mangis Road')");