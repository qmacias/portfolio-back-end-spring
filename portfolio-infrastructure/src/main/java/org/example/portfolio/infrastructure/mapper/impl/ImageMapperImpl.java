package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.example.portfolio.infrastructure.mapper.ImageMapper;

import java.util.ArrayList;
import java.util.List;

public class ImageMapperImpl implements ImageMapper {

    public ImageMapperImpl() {
    }

    @Override
    public ImageEntity mapDtoToEntity(ImageDto imageDto) {

        return new ImageEntity(
                imageDto.getId(),
                imageDto.getPath()
        );
    }

    @Override
    public ImageDto mapEntityToDto(ImageEntity imageEntity) {

        return new ImageDto(
                imageEntity.getId(),
                imageEntity.getPath()
        );
    }

    @Override
    public List<ImageDto> mapEntityListToDtoList(List<ImageEntity> imageEntityList) {

        List<ImageDto> imageDtoList = new ArrayList<>();

        imageEntityList.forEach(imageEntity -> {
                    ImageDto imageDto = this.mapEntityToDto(imageEntity);
                    imageDtoList.add(imageDto);
                });

        return imageDtoList;
    }

}
