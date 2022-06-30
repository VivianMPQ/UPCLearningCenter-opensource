package com.example.upclearningcenter.upclearning.mapping;

import com.example.upclearningcenter.learning.api.resource.CreateStudentResource;
import com.example.upclearningcenter.learning.api.resource.StudentResource;
import com.example.upclearningcenter.learning.api.resource.UpdateStudentResource;
import com.example.upclearningcenter.learning.domain.model.entity.Student;
import com.example.upclearningcenter.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class StudentMapper implements Serializable {
    //autowired -> permite inyectar dependencias automaticamente -> construye relaciones entre los elementos
    @Autowired
    EnhancedModelMapper mapper;
    //object mapping
    public StudentResource toResource(Student model){
        return mapper.map(model, StudentResource.class);
    }

    public Page<StudentResource>modelListPage(List<Student>modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, StudentResource.class), pageable, modelList.size());
    }

    public Student toModel(CreateStudentResource resource){
        return  mapper.map(resource, Student.class);
    }

    public Student toModel(UpdateStudentResource resource){
        return mapper.map(resource, Student.class);
    }

}
