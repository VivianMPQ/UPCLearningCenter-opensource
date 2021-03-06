package com.example.upclearningcenter.learning.domain.model.entity;

import com.example.upclearningcenter.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "students") //la tabla se llamara students
public class Student extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Size(max=100)
    private String name;


    private int age;

    @Size(max=240)
    private String address;


}
