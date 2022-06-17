package com.example.upclearningcenter.upclearning.mapping;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import com.example.upclearningcenter.shared.mapping.EnhancedModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class StudentMapper implements Serializable {
    EnhancedModelMapper mapper;

    public StudentMapper toResource(Student model){
        return mapper.map(model, StudentMapper.class);
    }

    public Page<StudentMapper> modelListPage(List<Student> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, StudentMapper.class),pageable, modelList.size());
    }
}
