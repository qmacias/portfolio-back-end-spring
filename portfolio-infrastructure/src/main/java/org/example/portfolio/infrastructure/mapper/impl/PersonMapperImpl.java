package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.example.portfolio.infrastructure.mapper.ImageMapper;
import org.example.portfolio.infrastructure.mapper.PersonMapper;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;

import java.util.ArrayList;
import java.util.List;

public class PersonMapperImpl implements PersonMapper {

    private final ImageMapper imageMapper;

    private final PhoneMapper phoneMapper;

    public PersonMapperImpl(
            ImageMapper imageMapper,
            PhoneMapper phoneMapper
    ) {
        this.imageMapper = imageMapper;
        this.phoneMapper = phoneMapper;
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

                imageMapper.mapDtoToEntity(personDto.getImage())
        );

        personDto.getPhones().forEach(phoneDto -> personEntity.addPhoneEntity(
                phoneMapper.mapDtoToEntity(phoneDto)
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

                imageMapper.mapEntityToDto(personEntity.getImageEntity())
        );

        personEntity.getPhoneEntities().forEach(phoneEntity -> personDto.addPhoneDto(
                phoneMapper.mapEntityToDto(phoneEntity)
        ));

        return personDto;
    }

    @Override
    public List<PersonDto> mapEntityListToDtoList(List<PersonEntity> personEntityList) {

        List<PersonDto> personDtoList = new ArrayList<>();

        personEntityList.forEach(personEntity -> {
                    PersonDto personDto = this.mapEntityToDto(personEntity);
                    personDtoList.add(personDto);
                });

        return personDtoList;
    }

}
