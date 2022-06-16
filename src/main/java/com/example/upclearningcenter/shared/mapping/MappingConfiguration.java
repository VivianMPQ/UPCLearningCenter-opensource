package com.example.upclearningcenter.shared.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {
    //usamos los beans -< permite trabajar con la data
    @Bean
    public EnhancedModelMapper modelMapper() {
        return new EnhancedModelMapper();
    }





}
