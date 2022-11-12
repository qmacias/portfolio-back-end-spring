package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.impl.PersonMapperImpl;

public interface PersonMapper extends GenericMapper<PersonEntity, PersonDto> {

    PersonMapper PERSON_INSTANCE = PersonMapperImpl.getInstance();

}
