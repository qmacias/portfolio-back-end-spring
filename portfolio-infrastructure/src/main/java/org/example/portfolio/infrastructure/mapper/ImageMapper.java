package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.domain.usecase.RequestModelMapperUseCase;
import org.example.portfolio.domain.usecase.ResponseModelMapperUseCase;

import org.example.portfolio.infrastructure.entity.ImageEntity;

public interface ImageMapper extends
        RequestModelMapperUseCase<ImageDto, ImageEntity>, ResponseModelMapperUseCase<ImageEntity, ImageDto> {
}
