package com.example.upclearningcenter.learning.api.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UpdateStudentResource {
    private Long id;

    @NotNull
    @NotBlank
    @Size(max=100)
    private String name;

    @Size(max = 240)
    private String address;

}
