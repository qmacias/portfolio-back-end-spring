package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.usecase.EntityToDtoUseCase;

public interface PersonEntityToPersonDtoMapper extends EntityToDtoUseCase<PersonEntity, PersonDto> {
}
