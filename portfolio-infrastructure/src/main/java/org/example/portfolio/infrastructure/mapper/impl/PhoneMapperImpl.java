package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;

import java.util.List;

import com.google.common.collect.Lists;

public class PhoneMapperImpl implements PhoneMapper {

    public PhoneMapperImpl() {
    }

    @Override
    public PhoneEntity mapDtoToEntity(PhoneDto phoneDto) {
        return PhoneEntity.of(phoneDto.getId(), phoneDto.getType(), phoneDto.getNumber());
    }

    @Override
    public PhoneDto mapEntityToDto(PhoneEntity phoneEntity) {
        return PhoneDto.of(phoneEntity.getId(), phoneEntity.getType(), phoneEntity.getNumber());
    }

    @Override
    public List<PhoneDto> mapEntityListToDtoList(List<PhoneEntity> phoneEntityList) {

        List<PhoneDto> phoneDtoList = Lists.newArrayList();

        phoneEntityList.forEach(phoneEntity -> phoneDtoList.add(
                this.mapEntityToDto(phoneEntity)
        ));

        return phoneDtoList;
    }

    @Override
    public List<PhoneEntity> mapDtoListToEntityList(List<PhoneDto> phoneDtoList) {

        List<PhoneEntity> phoneEntities = Lists.newArrayList();

        phoneDtoList.forEach(phoneDto -> phoneEntities.add(
                this.mapDtoToEntity(phoneDto)
        ));

        return phoneEntities;
    }

}
