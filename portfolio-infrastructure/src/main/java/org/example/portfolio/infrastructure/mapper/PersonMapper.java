package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.domain.common.GenericModelMapper;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface PersonMapper extends GenericModelMapper<PersonDto, PersonEntity> {

    PersonMapper INSTANCE = ModelMapperFactory.getFactory().getPersonMapperInstance();

}
