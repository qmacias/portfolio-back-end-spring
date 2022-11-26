package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.common.RequestModelMapperComponent;
import org.example.portfolio.domain.common.ResponseModelMapperComponent;
import org.example.portfolio.infrastructure.entity.ImageEntity;

public interface ImageMapper extends
        RequestModelMapperComponent<ImageDto, ImageEntity>, ResponseModelMapperComponent<ImageEntity, ImageDto> {
}
