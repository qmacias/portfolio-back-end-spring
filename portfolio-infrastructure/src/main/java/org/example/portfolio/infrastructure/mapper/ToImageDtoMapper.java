package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ToImageDtoMapperImpl;
import org.example.portfolio.infrastructure.usecase.EntityToDtoUseCase;

public interface ToImageDtoMapper extends EntityToDtoUseCase<ImageEntity, ImageDto> {

    ToImageDtoMapper TO_IMAGE_DTO_MAPPER = ToImageDtoMapperImpl.getInstance();

}
