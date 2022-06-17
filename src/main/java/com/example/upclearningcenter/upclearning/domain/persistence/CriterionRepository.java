package com.example.upclearningcenter.upclearning.domain.persistence;

import com.example.upclearningcenter.upclearning.domain.model.entity.Criterion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CriterionRepository extends JpaRepository<Criterion, Long> {

    List<Criterion> findBySkillId(Long skillId);

    Page<Criterion> finBySkillId(Long skillId, Pageable pageable);

    Optional<Criterion> findBySkillId(Long id, Long skillId);
}
