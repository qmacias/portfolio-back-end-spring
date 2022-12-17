package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageMapper;

public class ImageMapperImpl implements ImageMapper {

    public ImageMapperImpl() {
    }

    @Override
    public ImageEntity mapDtoToEntity(ImageDto imageDto) {
        return ImageEntity.of(this.checkIdentity(imageDto.getId()), imageDto.getPath());
    }

    @Override
    public ImageDto mapEntityToDto(ImageEntity imageEntity) {
        return ImageDto.of(imageEntity.getId(), imageEntity.getPath());
    }

}
