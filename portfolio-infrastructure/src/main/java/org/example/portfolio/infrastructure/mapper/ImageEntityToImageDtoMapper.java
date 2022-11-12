package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ImageEntityToImageDtoMapperImpl;
import org.example.portfolio.infrastructure.usecase.EntityToDtoUseCase;

public interface ImageEntityToImageDtoMapper extends EntityToDtoUseCase<ImageEntity, ImageDto> {

    ImageEntityToImageDtoMapper TO_IMAGE_DTO_MAPPER = ImageEntityToImageDtoMapperImpl.getInstance();

}
