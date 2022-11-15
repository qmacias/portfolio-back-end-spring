package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.domain.usecase.EntityToDtoMapperUseCase;

import org.example.portfolio.infrastructure.entity.PersonEntity;

public interface ToPersonDtoMapper extends EntityToDtoMapperUseCase<PersonEntity, PersonDto> {
}
