package com.example.upclearningcenter.learning.domain.service;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    List<Student>getAll();
  //sublista de una lista de objetos
    Page<Student>getAll(Pageable pageable);

    Student getById(Long studentId);

    //create update delete
    Student create (Student student);

    Student update (Long studentId, Student request);

    //<?> saca un conjunto de obj -> generico
    ResponseEntity<?> delete (Long studentId);

}
