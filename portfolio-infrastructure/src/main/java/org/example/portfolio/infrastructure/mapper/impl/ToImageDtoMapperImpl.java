package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ToImageDtoMapper;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ToImageDtoMapperImpl implements ToImageDtoMapper {

    private ModelMapper modelMapper;

    private ToImageDtoMapperImpl() {
        modelMapper = new ModelMapper();
    }

    private static class Holder {
        static final ToImageDtoMapper
                TO_IMAGE_DTO_MAPPER = new ToImageDtoMapperImpl();
    }

    public static ToImageDtoMapper getInstance() {
        return ToImageDtoMapperImpl.Holder.TO_IMAGE_DTO_MAPPER;
    }

    @Override
    public ImageDto mapEntityToDto(ImageEntity imageEntity) {
        return modelMapper.map(imageEntity, ImageDto.class);
    }

    @Override
    public List<ImageDto> mapEntityListToDtoList(List<ImageEntity> imageEntityList) {

        return imageEntityList.stream()
                .map(imageEntity -> modelMapper.map(imageEntity, ImageDto.class))
                .collect(Collectors.toList());
    }

}
