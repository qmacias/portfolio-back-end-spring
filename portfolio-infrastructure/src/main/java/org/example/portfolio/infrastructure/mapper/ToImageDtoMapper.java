package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.usecase.EntityToDtoMapperUseCase;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ToImageDtoMapperImpl;

public interface ToImageDtoMapper extends EntityToDtoMapperUseCase<ImageEntity, ImageDto> {

    ToImageDtoMapper TO_IMAGE_DTO_MAPPER = ToImageDtoMapperImpl.getInstance();

}
