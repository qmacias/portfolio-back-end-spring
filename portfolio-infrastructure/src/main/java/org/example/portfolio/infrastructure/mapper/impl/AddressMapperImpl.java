package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.AddressDto;
import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.example.portfolio.infrastructure.mapper.AddressMapper;

import java.util.ArrayList;
import java.util.List;

public class AddressMapperImpl implements AddressMapper {

    public AddressMapperImpl() {
    }

    @Override
    public AddressEntity mapDtoToEntity(AddressDto addressDto) {

        return AddressEntity.of(
                addressDto.getId(),
                addressDto.getType(),
                addressDto.getDescription()
        );
    }

    @Override
    public AddressDto mapEntityToDto(AddressEntity addressEntity) {

        return AddressDto.of(
                addressEntity.getId(),
                addressEntity.getType(),
                addressEntity.getDescription()
        );
    }

    @Override
    public List<AddressDto> mapEntityListToDtoList(List<AddressEntity> addressEntityList) {

        List<AddressDto> addressDtoList = new ArrayList<>();

        addressEntityList.forEach(addressEntity -> addressDtoList.add(
                this.mapEntityToDto(addressEntity)
        ));

        return addressDtoList;
    }

}
