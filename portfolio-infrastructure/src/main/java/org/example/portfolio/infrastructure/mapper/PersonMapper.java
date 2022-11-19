package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.domain.usecase.RequestModelMapperUseCase;
import org.example.portfolio.domain.usecase.ResponseModelMapperUseCase;

import org.example.portfolio.infrastructure.entity.PersonEntity;

public interface PersonMapper extends
        RequestModelMapperUseCase<PersonDto, PersonEntity>, ResponseModelMapperUseCase<PersonEntity, PersonDto> {
}
