package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.domain.usecase.DtoToEntityMapperUseCase;
import org.example.portfolio.domain.usecase.EntityToDtoMapperUseCase;

import org.example.portfolio.infrastructure.entity.ImageEntity;

public interface ToImageDtoOrEntityMapper extends
        EntityToDtoMapperUseCase<ImageEntity, ImageDto>, DtoToEntityMapperUseCase<ImageDto, ImageEntity> {
}
