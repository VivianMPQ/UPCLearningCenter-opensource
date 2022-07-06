package com.example.upclearningcenter.upclearning.domain.persistence;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {
    @Override
    List<Student>findAll();

    List<Student> findAllByAge(int age);

    Student findByName(String name);

    List<Student> findByAddressContains(String address);

    List<Student> findByNameOrAddressContains(String name, String address);


}
