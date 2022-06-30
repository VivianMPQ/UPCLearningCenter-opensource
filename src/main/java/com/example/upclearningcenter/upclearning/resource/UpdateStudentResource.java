package com.example.upclearningcenter.upclearning.resource;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UpdateStudentResource {
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

    @Size(max = 240)
    private String address;

}
