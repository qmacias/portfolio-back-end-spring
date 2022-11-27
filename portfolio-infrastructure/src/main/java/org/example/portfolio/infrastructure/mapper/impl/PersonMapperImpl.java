package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.AddressMapper;
import org.example.portfolio.infrastructure.mapper.ImageMapper;
import org.example.portfolio.infrastructure.mapper.PersonMapper;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;

import java.util.ArrayList;
import java.util.List;

public class PersonMapperImpl implements PersonMapper {

    public PersonMapperImpl() {
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {

        PersonEntity personEntity = new PersonEntity(
                personDto.getId(),
                personDto.getName(),
                personDto.getAge(),
                personDto.getDegree(),
                personDto.getEmail(),
                personDto.getSummary(),

                ImageMapper.INSTANCE.mapDtoToEntity(personDto.getImage())
        );

        personDto.getPhoneList().forEach(phoneDto -> personEntity.addPhoneEntity(
                PhoneMapper.INSTANCE.mapDtoToEntity(phoneDto)
        ));

        personDto.getAddressList().forEach(addressDto -> personEntity.addAddressEntity(
                AddressMapper.INSTANCE.mapDtoToEntity(addressDto)
        ));

        return personEntity;
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {

        PersonDto personDto = new PersonDto(
                personEntity.getId(),
                personEntity.getName(),
                personEntity.getAge(),
                personEntity.getDegree(),
                personEntity.getEmail(),
                personEntity.getSummary(),

                ImageMapper.INSTANCE.mapEntityToDto(personEntity.getImageEntity())
        );

        personEntity.getPhoneEntities().forEach(phoneEntity -> personDto.addPhoneDto(
                PhoneMapper.INSTANCE.mapEntityToDto(phoneEntity)
        ));

        personEntity.getAddressEntities().forEach(addressEntity -> personDto.addAddressDto(
                AddressMapper.INSTANCE.mapEntityToDto(addressEntity)
        ));

        return personDto;
    }

    @Override
    public List<PersonDto> mapEntityListToDtoList(List<PersonEntity> personEntityList) {

        List<PersonDto> personDtoList = new ArrayList<>();

        personEntityList.forEach(personEntity -> personDtoList.add(
                this.mapEntityToDto(personEntity)
        ));

        return personDtoList;
    }

}
