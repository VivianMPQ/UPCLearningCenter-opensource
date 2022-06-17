package com.example.upclearningcenter.upclearning.domain.service;

import com.example.upclearningcenter.upclearning.domain.model.entity.Criterion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CriterionService {
    List<Criterion> getAll();
    List<Criterion> getAllBySkillId(Long skillId);
    Page<Criterion> getAllSkillId(Long skillId, Pageable pageable);
    Criterion create(Long skillId, Criterion criterion);
    Criterion update(Long skillId, Long CriterionId, Criterion criterion);

    ResponseEntity<?> delete(Long skillId, Long criterionId);


}
