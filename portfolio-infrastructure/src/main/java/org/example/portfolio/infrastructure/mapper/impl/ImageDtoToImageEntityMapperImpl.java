package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageDtoToImageEntityMapper;

import org.modelmapper.ModelMapper;

public class ImageDtoToImageEntityMapperImpl implements ImageDtoToImageEntityMapper {

    private ModelMapper modelMapper;

    private ImageDtoToImageEntityMapperImpl() {
        modelMapper = new ModelMapper();
    }

    private static class Holder {
        static final ImageDtoToImageEntityMapper
                TO_IMAGE_ENTITY_MAPPER = new ImageDtoToImageEntityMapperImpl();
    }

    public static ImageDtoToImageEntityMapper getInstance() {
        return ImageDtoToImageEntityMapperImpl.Holder.TO_IMAGE_ENTITY_MAPPER;
    }

    @Override
    public ImageEntity mapDtoToEntity(ImageDto imageDto) {
        return modelMapper.map(imageDto, ImageEntity.class);
    }

}
