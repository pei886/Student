package com.example.MyProject;

import com.example.MyProject.model.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Students, Integer> {

}
