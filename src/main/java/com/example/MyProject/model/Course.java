package com.example.MyProject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Data
public class Course {

//    public void setId(Integer id) {
//        this.id = id;
//    }
//
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;

    @Column(name = "course_name")
    private String course_name;

    @Column(name = "teacher_name")
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
