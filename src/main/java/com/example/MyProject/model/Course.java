package com.example.MyProject.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
@Data
public class Course {

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    Integer id;

    @Column
    private String course_name;

    @Column
    private String teacher_name;

    @Column
    private String student_name;

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

}
