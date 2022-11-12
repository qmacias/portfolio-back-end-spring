package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageMapper;

import org.modelmapper.ModelMapper;

public class ImageMapperImpl implements ImageMapper {

    private ImageMapperImpl() {
    }

    private static class Holder {
        static final ImageMapperImpl IMAGE_MAPPER = new ImageMapperImpl();
    }

    public static ImageMapperImpl getInstance() {
        return ImageMapperImpl.Holder.IMAGE_MAPPER;
    }

    private ModelMapper mapper = null;

    @Override
    public ImageDto mapEntityToDto(ImageEntity imageEntity) {

        mapper = new ModelMapper();

        return this.mapper.map(imageEntity, ImageDto.class);
    }

    @Override
    public ImageEntity mapDtoToEntity(ImageDto imageDto) {

        mapper = new ModelMapper();

        return this.mapper.map(imageDto, ImageEntity.class);
    }

}
