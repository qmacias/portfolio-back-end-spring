package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.common.GenericModelMapper;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public abstract class ImageMapper extends GenericModelMapper<ImageDto, ImageEntity> {
    public static final ImageMapper INSTANCE = ModelMapperFactory.getFactory().getImageMapperInstance();
}
