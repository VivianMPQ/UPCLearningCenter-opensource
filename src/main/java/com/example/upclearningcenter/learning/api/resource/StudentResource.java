package com.example.upclearningcenter.learning.api.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class StudentResource {
    private Long id;
    private String name;
    private String address;
}
