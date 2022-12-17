package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.common.ObjectModelMapper;
import org.example.portfolio.domain.common.CollectionModelMapper;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

import java.util.Set;

public interface PersonMapper extends
        ObjectModelMapper<PersonDto, PersonEntity>, CollectionModelMapper<Set<PersonDto>, Set<PersonEntity>> {
    PersonMapper INSTANCE = ModelMapperFactory.getFactory().getPersonMapperInstance();
}
