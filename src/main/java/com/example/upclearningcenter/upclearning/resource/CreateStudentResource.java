package com.example.upclearningcenter.upclearning.resource;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentResource {
    @NotBlank
    @NonNull
    @Size(max = 100)
    private String name;

    @Size(max = 240)
    private String address;
}
