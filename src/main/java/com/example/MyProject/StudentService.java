package com.example.MyProject;

import com.example.MyProject.StudentLoginRowMapper;
import com.example.MyProject.StudentRepository;
import com.example.MyProject.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    StudentRepository studentRepository;

    public String getstudents(){
        Iterable<Students> a = studentRepository.findAll();
        //        List<Students> student= jdbcTemplate.query("select * from login", new StudentLoginRowMapper());\
        return a.toString();
    }

    public void registerNewStudent(Students students){
                jdbcTemplate.execute("insert into students (username, password, full_name, dob, age, gender, address)\n" +
                        "values ('usernumber2', '743832', 'User Wong', '2004-04-23', 17, 'M', 'Mangis Road')");
    }
}
