package com.example.upclearningcenter.learning.api.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentResource {
    @NotBlank
    @NotNull
    @Size(max=100)
    private String name;

    @Size(max=240)
    private String address;
}
