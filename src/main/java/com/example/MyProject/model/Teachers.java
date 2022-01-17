package com.example.MyProject.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
@Data
public class Teachers {

    @Id
    private int id;

    @Column
    private String full_name;

    @Column
    private String gender;

    @Column
    private String teaching_subject;

    public void setId(int id) {
        this.id = id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTeaching_subject(String teaching_subject) {
        this.teaching_subject = teaching_subject;
    }

}
