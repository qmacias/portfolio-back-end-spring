package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.usecase.EntityToDtoUseCase;
import org.example.portfolio.infrastructure.mapper.impl.PersonEntityToPersonDtoMapperImpl;

public interface PersonEntityToPersonDtoMapper extends EntityToDtoUseCase<PersonEntity, PersonDto> {

    PersonEntityToPersonDtoMapper TO_PERSON_DTO_MAPPER = PersonEntityToPersonDtoMapperImpl.getInstance();

}
