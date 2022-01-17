package com.example.MyProject;

import com.example.MyProject.model.Students;
import com.example.MyProject.model.Students;
import org.springframework.jdbc.core.RowMapper;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PasswordRowMapper implements RowMapper<Students> {

    @Override
    public Students mapRow(ResultSet rs, int i) throws SQLException {
        Students st = new Students();
        st.setPassword(rs.getString("password"));
        return st;
    }
}