package com.example.upclearningcenter.upclearning.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
public class UpdateSkillResource {

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

}
