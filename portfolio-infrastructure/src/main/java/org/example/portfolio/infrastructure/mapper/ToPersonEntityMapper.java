package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.usecase.DtoToEntityMapperUseCase;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.impl.ToPersonEntityMapperImpl;

public interface ToPersonEntityMapper extends DtoToEntityMapperUseCase<PersonDto, PersonEntity> {

    ToPersonEntityMapper TO_PERSON_ENTITY_MAPPER = ToPersonEntityMapperImpl.getInstance();

}
