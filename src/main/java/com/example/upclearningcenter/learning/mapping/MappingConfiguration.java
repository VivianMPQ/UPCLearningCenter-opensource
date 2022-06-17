package com.example.upclearningcenter.learning.mapping;

import com.example.upclearningcenter.learning.domain.model.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("learningMappingConfiguration")
public class MappingConfiguration {

    public StudentMapper studentMapper(){
        return new StudentMapper();
    }

}
