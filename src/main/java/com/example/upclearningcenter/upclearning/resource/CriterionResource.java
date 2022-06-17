package com.example.upclearningcenter.upclearning.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CriterionResource {
    private Long id;
    private String name;
    private SkillResource skillResource;
}
