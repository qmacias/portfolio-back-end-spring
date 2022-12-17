package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.common.ObjectModelMapper;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface ImageMapper extends ObjectModelMapper<ImageDto, ImageEntity> {
    ImageMapper INSTANCE = ModelMapperFactory.getFactory().getImageMapperInstance();
}
