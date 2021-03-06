package com.example.upclearningcenter.upclearning.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CriterionResource {

    private Long id;
    @NotBlank
    @NonNull
    @Size(max = 100)
    private String name;
    private SkillResource skillResource;
}
