package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ToImageEntityMapperImpl;
import org.example.portfolio.infrastructure.usecase.DtoToEntityUseCase;

public interface ToImageEntityMapper extends DtoToEntityUseCase<ImageDto, ImageEntity> {

    ToImageEntityMapper TO_IMAGE_ENTITY_MAPPER = ToImageEntityMapperImpl.getInstance();

}
