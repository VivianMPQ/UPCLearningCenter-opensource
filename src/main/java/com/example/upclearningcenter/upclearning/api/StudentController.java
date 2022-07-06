package com.example.upclearningcenter.upclearning.api;

import com.example.upclearningcenter.learning.api.resource.CreateStudentResource;
import com.example.upclearningcenter.learning.api.resource.StudentResource;
import com.example.upclearningcenter.learning.api.resource.UpdateStudentResource;
import com.example.upclearningcenter.upclearning.domain.model.entity.Student;
import com.example.upclearningcenter.upclearning.domain.service.StudentService;
import com.example.upclearningcenter.upclearning.mapping.StudentMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/students")
public class StudentController {
    private final StudentService studentService;
    private final StudentMapper mapper;

    public StudentController(StudentService studentService, StudentMapper mapper) {
        this.studentService = studentService;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<StudentResource> getAllStudents(Pageable pageable) {
        return mapper.modelListPage(studentService.getAll(), pageable);
    }

    @GetMapping("{studentId}")
    public StudentResource getStudentById(Long studentId) {
        return mapper.toResource(studentService.getById(studentId));
    }

    @PostMapping
    public ResponseEntity<StudentResource> createStudent(CreateStudentResource resource) {
        return new ResponseEntity<>(mapper.toResource(studentService.create(mapper.toModel(resource))), HttpStatus.CREATED);
    }

    @PutMapping("{studentId}")
    private StudentResource updateStudentP(Long studentId, UpdateStudentResource resource) {
        return mapper.toResource(studentService.update(studentId, mapper.toModel(resource)));
    }

    @DeleteMapping("{studentId}")
    public ResponseEntity<?> deleteStudent(Long studentId) {
        return studentService.delete(studentId);
    }

}
