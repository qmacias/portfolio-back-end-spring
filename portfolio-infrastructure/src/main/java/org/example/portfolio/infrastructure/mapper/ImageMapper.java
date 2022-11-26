package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.common.RequestModelMapper;
import org.example.portfolio.domain.common.ResponseModelMapper;
import org.example.portfolio.infrastructure.entity.ImageEntity;

public interface ImageMapper extends
        RequestModelMapper<ImageDto, ImageEntity>, ResponseModelMapper<ImageEntity, ImageDto> {
}
