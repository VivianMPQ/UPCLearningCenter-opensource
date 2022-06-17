package com.example.upclearningcenter.upclearning.domain.service;

import com.example.upclearningcenter.upclearning.domain.model.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
//escoger todo de data domain
public interface SkillService {
    List<Skill> getAll();
    Page<Skill>  getAll(Pageable pageable);
    Skill getById(Long skillId);
    Skill getByName(String name);
    Skill create(Skill skill);
    Skill update(Long id, Skill skill);
    ResponseEntity<?> delete(Long skillId);
}
