package com.example.upclearningcenter.learning.domain.persistence;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByAge(int age);
    Student findByName(String name);
    Student findAllByName(String name);


}
