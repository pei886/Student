package com.example.MyProject;

import com.example.MyProject.model.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Students, Integer> {

//    @Query("select password from students where full_name = 'Helen Pei'")
//    List<Students> getPasswordByName();
//
//    void registerNewStudent(Students students);
}
