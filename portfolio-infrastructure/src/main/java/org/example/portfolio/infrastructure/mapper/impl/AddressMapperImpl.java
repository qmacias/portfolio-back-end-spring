package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.AddressDto;

import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.example.portfolio.infrastructure.mapper.AddressMapper;

import java.util.List;

import com.google.common.collect.Lists;

public class AddressMapperImpl extends AddressMapper {

    public AddressMapperImpl() {
    }

    @Override
    public AddressEntity mapDtoToEntity(AddressDto addressDto) {
        return AddressEntity.of(this.checkIdentity(addressDto.getId()), addressDto.getType(), addressDto.getDescription());
    }

    @Override
    public AddressDto mapEntityToDto(AddressEntity addressEntity) {
        return AddressDto.of(addressEntity.getId(), addressEntity.getType(), addressEntity.getDescription());
    }

    @Override
    public List<AddressDto> mapEntityListToDtoList(List<AddressEntity> addressEntityList) {

        List<AddressDto> addressDtoList = Lists.newArrayList();

        addressEntityList.forEach(addressEntity -> addressDtoList.add(
                this.mapEntityToDto(addressEntity)
        ));

        return addressDtoList;
    }

    @Override
    public List<AddressEntity> mapDtoListToEntityList(List<AddressDto> addressDtoList) {

        List<AddressEntity> addressEntities = Lists.newArrayList();

        addressDtoList.forEach(addressDto -> addressEntities.add(
                this.mapDtoToEntity(addressDto)
        ));

        return addressEntities;
    }

}
