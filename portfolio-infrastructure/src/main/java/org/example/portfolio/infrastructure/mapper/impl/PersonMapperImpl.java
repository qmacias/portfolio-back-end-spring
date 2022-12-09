package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.model.PersonDtoBuilder;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.entity.PersonEntityBuilder;
import org.example.portfolio.infrastructure.mapper.*;

import java.util.ArrayList;
import java.util.List;

public class PersonMapperImpl implements PersonMapper {

    public PersonMapperImpl() {
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {

        PersonEntity personEntity = new PersonEntityBuilder()
                .setId(personDto.getId())
                .setName(personDto.getName())
                .setAge(personDto.getAge())
                .setDegree(personDto.getDegree())
                .setEmail(personDto.getEmail())
                .setSummary(personDto.getSummary())
                .setImageEntity(
                        ImageMapper.INSTANCE.mapDtoToEntity(personDto.getImageDto())
                ).createPersonEntity();

        personDto.getPhoneList().forEach(phoneDto -> personEntity.addPhoneEntity(
                PhoneMapper.INSTANCE.mapDtoToEntity(phoneDto)
        ));

        personDto.getAddressList().forEach(addressDto -> personEntity.addAddressEntity(
                AddressMapper.INSTANCE.mapDtoToEntity(addressDto)
        ));

        personDto.getSocialList().forEach(socialDto -> personEntity.addSocialEntity(
                SocialMapper.INSTANCE.mapDtoToEntity(socialDto)
        ));

        return personEntity;
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {

        PersonDto personDto = new PersonDtoBuilder()
                .setId(personEntity.getId())
                .setName(personEntity.getName())
                .setAge(personEntity.getAge())
                .setDegree(personEntity.getDegree())
                .setEmail(personEntity.getEmail())
                .setSummary(personEntity.getSummary())
                .setImage(
                        ImageMapper.INSTANCE.mapEntityToDto(personEntity.getImageEntity())
                ).createPersonDto();

        personEntity.getPhoneEntities().forEach(phoneEntity -> personDto.addPhoneDto(
                PhoneMapper.INSTANCE.mapEntityToDto(phoneEntity)
        ));

        personEntity.getAddressEntities().forEach(addressEntity -> personDto.addAddressDto(
                AddressMapper.INSTANCE.mapEntityToDto(addressEntity)
        ));

        personEntity.getSocialEntities().forEach(socialEntity -> personDto.addSocialDto(
                SocialMapper.INSTANCE.mapEntityToDto(socialEntity)
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
