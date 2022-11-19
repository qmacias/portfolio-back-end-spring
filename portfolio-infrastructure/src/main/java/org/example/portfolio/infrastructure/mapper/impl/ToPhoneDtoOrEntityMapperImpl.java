package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.ToPhoneDtoOrEntityMapper;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ToPhoneDtoOrEntityMapperImpl implements ToPhoneDtoOrEntityMapper {

    private ModelMapper modelMapper;

    public ToPhoneDtoOrEntityMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public PhoneDto mapEntityToDto(PhoneEntity phoneEntity) {
        return modelMapper.map(phoneEntity, PhoneDto.class);
    }

    @Override
    public PhoneEntity mapDtoToEntity(PhoneDto phoneDto) {
        return modelMapper.map(phoneDto, PhoneEntity.class);
    }

    @Override
    public List<PhoneDto> mapEntityListToDtoList(List<PhoneEntity> phoneEntityList) {

        return phoneEntityList.stream()
                .map(phoneEntity -> modelMapper.map(phoneEntity, PhoneDto.class))
                .collect(Collectors.toList());
    }

}
