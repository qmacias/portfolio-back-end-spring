package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ImageDtoToImageEntityMapperImpl;
import org.example.portfolio.infrastructure.usecase.DtoToEntityUseCase;

public interface ImageDtoToImageEntityMapper extends DtoToEntityUseCase<ImageDto, ImageEntity> {

    ImageDtoToImageEntityMapper TO_IMAGE_ENTITY_MAPPER = ImageDtoToImageEntityMapperImpl.getInstance();

}
