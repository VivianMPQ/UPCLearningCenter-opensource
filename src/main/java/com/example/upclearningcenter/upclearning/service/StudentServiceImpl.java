package com.example.upclearningcenter.upclearning.service;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import com.example.upclearningcenter.learning.domain.persistence.StudentRepository;
import com.example.upclearningcenter.learning.domain.service.StudentService;
import com.example.upclearningcenter.shared.exception.ResourceNotFoundException;
import com.example.upclearningcenter.shared.exception.ResourceValidationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;


import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

//implementacion student service
public class StudentServiceImpl implements StudentService {

    private static final String ENTITY ="Student";

    private final StudentRepository studentRepository;

    private final Validator validator;

    public StudentServiceImpl(StudentRepository studentRepository, Validator validator){
        this.studentRepository=studentRepository;
        this.validator=validator;
    }

    //generar los miembros
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Page<Student> getAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student getById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(()->new ResourceNotFoundException(ENTITY, studentId));
    }

    @Override
    public Student create(Student student) {
        Set<ConstraintViolation<Student>> violations=validator.validate(student);
        if (!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);
       //nombres unicos
        Student studentWithName=studentRepository.findByName(student.getName());
        if (studentWithName!=null)
            throw new ResourceValidationException(ENTITY,"An student with the same name exits");
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long studentId, Student request) {
        Set<ConstraintViolation<Student>> violations=validator.validate(request);
        if(!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);
        Student studentWithName=studentRepository.findByName(request.getName());
        if (studentWithName!=null&& !studentWithName.getId().equals(studentId))
            throw new ResourceValidationException(ENTITY,
                    "An student with the same name already exits");

        return studentRepository.findById(studentId).map(request1->
                studentRepository.save(request1.withName(request1.getName())
                        .withAge(request1.getAge())
                        .withAddress(request1.getAddress())))
                        .orElseThrow(()->new ResourceNotFoundException(ENTITY, studentId));
    }

    @Override
    public ResponseEntity<?> delete(Long studentId) {
        return studentRepository.findById(studentId).map(student -> {
            studentRepository.delete(student);
            return ResponseEntity.ok().build();
        }).orElseThrow(()->new ResourceNotFoundException(ENTITY, studentId));
    }


}
