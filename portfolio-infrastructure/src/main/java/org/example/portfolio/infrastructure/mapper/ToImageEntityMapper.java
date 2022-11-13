package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.usecase.DtoToEntityMapperUseCase;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ToImageEntityMapperImpl;

public interface ToImageEntityMapper extends DtoToEntityMapperUseCase<ImageDto, ImageEntity> {

    ToImageEntityMapper TO_IMAGE_ENTITY_MAPPER = ToImageEntityMapperImpl.getInstance();

}
