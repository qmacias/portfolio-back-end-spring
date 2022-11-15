package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.example.portfolio.infrastructure.mapper.ToImageDtoOrEntityMapper;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ToImageDtoOrEntityMapperImpl implements ToImageDtoOrEntityMapper {

    private ModelMapper modelMapper;

    public ToImageDtoOrEntityMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ImageDto mapEntityToDto(ImageEntity imageEntity) {
        return modelMapper.map(imageEntity, ImageDto.class);
    }

    @Override
    public ImageEntity mapDtoToEntity(ImageDto imageDto) {
        return modelMapper.map(imageDto, ImageEntity.class);
    }

    @Override
    public List<ImageDto> mapEntityListToDtoList(List<ImageEntity> imageEntityList) {

        return imageEntityList.stream()
                .map(imageEntity -> modelMapper.map(imageEntity, ImageDto.class))
                .collect(Collectors.toList());
    }

}
