package com.example.MyProject;

import com.example.MyProject.model.Students;
import com.example.MyProject.model.Students;
import org.springframework.jdbc.core.RowMapper;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Students> {

    @Override
    public Students mapRow(ResultSet rs, int i) throws SQLException {
        Students students = new Students();
        students.setId(rs.getInt("id"));
        students.setUsername(rs.getString("username"));
        students.setPassword(rs.getString("password"));
        students.setFull_name(rs.getString("full_name"));
        students.setAge(rs.getInt("age"));
        students.setGender(rs.getString("gender"));
        students.setAddress(rs.getString("address"));
        return students;
    }
}