package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.usecase.DtoToEntityUseCase;
import org.example.portfolio.infrastructure.mapper.impl.PersonDtoToPersonEntityMapperImpl;

public interface PersonDtoToPersonEntityMapper extends DtoToEntityUseCase<PersonDto, PersonEntity> {

    PersonDtoToPersonEntityMapper TO_PERSON_ENTITY_MAPPER = PersonDtoToPersonEntityMapperImpl.getInstance();

}
