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

        return new AddressEntity(
                addressDto.getId(),
                addressDto.getType(),
                addressDto.getDescription()
        );
    }

    @Override
    public AddressDto mapEntityToDto(AddressEntity addressEntity) {

        return new AddressDto(
                addressEntity.getId(),
                addressEntity.getType(),
                addressEntity.getDescription()
        );
    }

    @Override
    public List<AddressDto> mapEntityListToDtoList(List<AddressEntity> addressEntityList) {

        List<AddressDto> addressDtoList = new ArrayList<>();

        addressEntityList.forEach(addressEntity -> {
            AddressDto addressDto = this.mapEntityToDto(addressEntity);
            addressDtoList.add(addressDto);
        });

        return addressDtoList;
    }

}
