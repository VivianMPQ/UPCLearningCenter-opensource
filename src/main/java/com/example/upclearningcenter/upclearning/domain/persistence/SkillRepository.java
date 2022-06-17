package com.example.upclearningcenter.upclearning.domain.persistence;

import com.example.upclearningcenter.upclearning.domain.model.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

    List<Skill> findByName(String name, Pageable pageable);

    Optional<Skill> findByName(String name);

}
