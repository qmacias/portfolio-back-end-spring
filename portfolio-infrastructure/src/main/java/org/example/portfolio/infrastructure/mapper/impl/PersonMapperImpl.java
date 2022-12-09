package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.model.PersonDtoBuilder;

import org.example.portfolio.infrastructure.mapper.*;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.entity.PersonEntityBuilder;

import java.util.List;

import com.google.common.collect.Lists;

public class PersonMapperImpl implements PersonMapper {

    public PersonMapperImpl() {
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {
        return new PersonEntityBuilder()
                .setId(personDto.getId())
                .setName(personDto.getName())
                .setAge(personDto.getAge())
                .setDegree(personDto.getDegree())
                .setEmail(personDto.getEmail())
                .setSummary(personDto.getSummary())
                .setImageEntity(ImageMapper.INSTANCE.mapDtoToEntity(personDto.getImageDto()))
                .setPhoneEntities(PhoneMapper.INSTANCE.mapDtoListToEntityList(personDto.getPhoneDtoList()))
                .setAddressEntities(AddressMapper.INSTANCE.mapDtoListToEntityList(personDto.getAddressDtoList()))
                .setSocialEntities(SocialMapper.INSTANCE.mapDtoListToEntityList(personDto.getSocialDtoList()))
                .createPersonEntity();
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {
        return new PersonDtoBuilder()
                .setId(personEntity.getId())
                .setName(personEntity.getName())
                .setAge(personEntity.getAge())
                .setDegree(personEntity.getDegree())
                .setEmail(personEntity.getEmail())
                .setSummary(personEntity.getSummary())
                .setImageDto(ImageMapper.INSTANCE.mapEntityToDto(personEntity.getImageEntity()))
                .setPhoneDtoList(PhoneMapper.INSTANCE.mapEntityListToDtoList(personEntity.getPhoneEntities()))
                .setAddressDtoList(AddressMapper.INSTANCE.mapEntityListToDtoList(personEntity.getAddressEntities()))
                .setSocialDtoList(SocialMapper.INSTANCE.mapEntityListToDtoList(personEntity.getSocialEntities()))
                .createPersonDto();
    }

    @Override
    public List<PersonDto> mapEntityListToDtoList(List<PersonEntity> personEntityList) {

        List<PersonDto> personDtoList = Lists.newArrayList();

        personEntityList.forEach(personEntity -> personDtoList.add(
                this.mapEntityToDto(personEntity)
        ));

        return personDtoList;
    }

    @Override
    public List<PersonEntity> mapDtoListToEntityList(List<PersonDto> personDtoList) {

        List<PersonEntity> personEntities = Lists.newArrayList();

        personDtoList.forEach(personDto -> personEntities.add(
                this.mapDtoToEntity(personDto)
        ));

        return personEntities;
    }

}
