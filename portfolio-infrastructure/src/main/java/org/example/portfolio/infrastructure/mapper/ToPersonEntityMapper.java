package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.domain.usecase.DtoToEntityMapperUseCase;

import org.example.portfolio.infrastructure.entity.PersonEntity;

public interface ToPersonEntityMapper extends DtoToEntityMapperUseCase<PersonDto, PersonEntity> {
}
