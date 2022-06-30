package com.example.upclearningcenter.upclearning.mapping;

import com.example.upclearningcenter.shared.mapping.EnhancedModelMapper;
import com.example.upclearningcenter.upclearning.domain.model.entity.Criterion;
import com.example.upclearningcenter.upclearning.resource.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class CriterionMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public CriterionResource toResource(Criterion model){
        return mapper.map(model, CriterionResource.class);
    }

    public Page<CriterionResource> modelListPage(List<Criterion> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, CriterionResource.class), pageable, modelList.size());
    }

    public Criterion toModel(CreateCriterionResource resource){
        return mapper.map(resource, Criterion.class);
    }

    public Criterion toModel(UpdateCriterionResource resource){
        return mapper.map(resource, Criterion.class);
    }
}
