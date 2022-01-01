package com.example.MyProject;

import com.example.MyProject.model.Students;
import com.example.MyProject.model.Students;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentLoginRowMapper implements RowMapper<Students> {

    @Override
    public Students mapRow(ResultSet resultSet, int i) throws SQLException {
        Students students = new Students();
        students.setId(resultSet.getInt("id"));
        students.setFull_name(resultSet.getString("full_name"));
        students.setPassword(resultSet.getString("password"));
        return students;
    }
}