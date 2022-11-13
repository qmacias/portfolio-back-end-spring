package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageEntityToImageDtoMapper;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ImageEntityToImageDtoMapperImpl implements ImageEntityToImageDtoMapper {

    private ModelMapper modelMapper;

    private ImageEntityToImageDtoMapperImpl() {
        modelMapper = new ModelMapper();
    }

    private static class Holder {
        static final ImageEntityToImageDtoMapper
                TO_IMAGE_DTO_MAPPER = new ImageEntityToImageDtoMapperImpl();
    }

    public static ImageEntityToImageDtoMapper getInstance() {
        return ImageEntityToImageDtoMapperImpl.Holder.TO_IMAGE_DTO_MAPPER;
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
