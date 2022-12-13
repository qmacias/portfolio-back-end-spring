package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageMapper;

import java.util.Set;

import com.google.common.collect.Sets;

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
    public Set<ImageDto> mapEntitySetToDtoSet(Set<ImageEntity> imageEntitySet) {

        Set<ImageDto> imageDtoSet = Sets.newHashSet();

        imageEntitySet.forEach(imageEntity -> imageDtoSet.add(
                this.mapEntityToDto(imageEntity)
        ));

        return imageDtoSet;
    }

    @Override
    public Set<ImageEntity> mapDtoSetToEntitySet(Set<ImageDto> imageDtoSet) {

        Set<ImageEntity> imageEntities = Sets.newHashSet();

        imageDtoSet.forEach(imageDto -> imageEntities.add(
                this.mapDtoToEntity(imageDto)
        ));

        return imageEntities;
    }

}
