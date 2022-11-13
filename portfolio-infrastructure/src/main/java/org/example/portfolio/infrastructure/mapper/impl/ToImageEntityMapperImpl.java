package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ToImageEntityMapper;

import org.modelmapper.ModelMapper;

public class ToImageEntityMapperImpl implements ToImageEntityMapper {

    private ModelMapper modelMapper;

    private ToImageEntityMapperImpl() {
        modelMapper = new ModelMapper();
    }

    private static class Holder {
        static final ToImageEntityMapper
                TO_IMAGE_ENTITY_MAPPER = new ToImageEntityMapperImpl();
    }

    public static ToImageEntityMapper getInstance() {
        return ToImageEntityMapperImpl.Holder.TO_IMAGE_ENTITY_MAPPER;
    }

    @Override
    public ImageEntity mapDtoToEntity(ImageDto imageDto) {
        return modelMapper.map(imageDto, ImageEntity.class);
    }

}
