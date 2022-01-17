package com.example.MyProject.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
public class Students {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private Integer age;

    public int getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
