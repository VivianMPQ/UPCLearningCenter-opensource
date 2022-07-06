package com.example.upclearningcenter.upclearning.domain.service;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import org.apache.coyote.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.awt.print.Pageable;
import java.util.List;

//polimorfismo
//@Bean
public interface StudentService {

    List<Student> getAll();

    Page<Student> getAll(Pageable pageable);

    Student getById(Long studentId);

    Student getByName(String name);

    Student create(Student student);

    Student update(Long id, Student student);

    ResponseEntity<?> delete (Long studentId);

}
