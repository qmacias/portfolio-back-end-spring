package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.usecase.EntityToDtoUseCase;
import org.example.portfolio.infrastructure.mapper.impl.ToPersonDtoMapperImpl;

public interface ToPersonDtoMapper extends EntityToDtoUseCase<PersonEntity, PersonDto> {

    ToPersonDtoMapper TO_PERSON_DTO_MAPPER = ToPersonDtoMapperImpl.getInstance();

}
