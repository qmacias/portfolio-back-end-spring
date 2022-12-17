package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.DurationDto;
import org.example.portfolio.domain.common.ObjectModelMapper;

import org.example.portfolio.infrastructure.entity.DurationEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface DurationMapper extends ObjectModelMapper<DurationDto, DurationEntity> {
    DurationMapper INSTANCE = ModelMapperFactory.getFactory().getDurationMapperInstance();
}
