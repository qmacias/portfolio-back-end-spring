package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ImageMapperImpl;

public interface ImageMapper extends GenericMapper<ImageEntity, ImageDto> {

    ImageMapper IMAGE_INSTANCE = ImageMapperImpl.getInstance();

}
