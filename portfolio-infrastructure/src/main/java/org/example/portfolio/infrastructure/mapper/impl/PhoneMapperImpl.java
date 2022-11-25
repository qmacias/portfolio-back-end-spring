package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;

import java.util.ArrayList;
import java.util.List;

public class PhoneMapperImpl implements PhoneMapper {

    public PhoneMapperImpl() {
    }

    @Override
    public PhoneEntity mapDtoToEntity(PhoneDto phoneDto) {

        return new PhoneEntity(
                phoneDto.getId(),
                phoneDto.getType(),
                phoneDto.getNumber()
        );
    }

    @Override
    public PhoneDto mapEntityToDto(PhoneEntity phoneEntity) {

        return new PhoneDto(
                phoneEntity.getId(),
                phoneEntity.getType(),
                phoneEntity.getNumber()
        );
    }

    @Override
    public List<PhoneDto> mapEntityListToDtoList(List<PhoneEntity> phoneEntityList) {

        List<PhoneDto> phoneDtoList = new ArrayList<>();

        phoneEntityList.forEach(phoneEntity -> {
            PhoneDto phoneDto = this.mapEntityToDto(phoneEntity);
            phoneDtoList.add(phoneDto);
        });

        return phoneDtoList;
    }

}
