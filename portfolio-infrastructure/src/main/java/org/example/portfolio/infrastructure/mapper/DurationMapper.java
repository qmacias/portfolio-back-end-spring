package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.DurationDto;
import org.example.portfolio.domain.common.GenericModelMapper;

import org.example.portfolio.infrastructure.entity.DurationEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface DurationMapper extends GenericModelMapper<DurationDto, DurationEntity> {
    DurationMapper INSTANCE = ModelMapperFactory.getFactory().getDurationMapperInstance();
}
