package com.example.upclearningcenter.upclearning.domain.model.entity;

import com.example.upclearningcenter.shared.domain.model.AuditModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "criteria")
public class Criterion extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    private String name;

    //hay una relacion entre estudinates y skill
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "skillid", nullable = false)
    @JsonIgnore
    private Skill skill;
}
