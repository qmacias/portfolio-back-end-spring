package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageMapper;

import java.util.List;

import com.google.common.collect.Lists;

public class ImageMapperImpl extends ImageMapper {

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

    @Override
    public List<ImageDto> mapEntityListToDtoList(List<ImageEntity> imageEntityList) {

        List<ImageDto> imageDtoList = Lists.newArrayList();

        imageEntityList.forEach(imageEntity -> imageDtoList.add(
                this.mapEntityToDto(imageEntity)
        ));

        return imageDtoList;
    }

    @Override
    public List<ImageEntity> mapDtoListToEntityList(List<ImageDto> imageDtoList) {

        List<ImageEntity> imageEntities = Lists.newArrayList();

        imageDtoList.forEach(imageDto -> imageEntities.add(
                this.mapDtoToEntity(imageDto)
        ));

        return imageEntities;
    }

}
