package com.example.upclearningcenter.upclearning.mapping;
import com.example.upclearningcenter.shared.mapping.EnhancedModelMapper;
import com.example.upclearningcenter.upclearning.domain.model.entity.Skill;
import com.example.upclearningcenter.upclearning.resource.CreateSkillResource;
import com.example.upclearningcenter.upclearning.resource.SkillResource;
import com.example.upclearningcenter.upclearning.resource.UpdateSkillResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class SkillMapper implements Serializable {
    //manipulacion de la data
    @Autowired
    EnhancedModelMapper mapper;

    public SkillResource toResource(Skill model){
        return mapper.map(model, SkillResource.class);
    }

    public Page<SkillResource> modelListPage(List<Skill> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, SkillResource.class), pageable, modelList.size());
    }

    public Skill toModel(CreateSkillResource resource){
        return mapper.map(resource, Skill.class);
    }

    public Skill toModel(UpdateSkillResource resource){
        return mapper.map(resource, Skill.class);
    }


}
