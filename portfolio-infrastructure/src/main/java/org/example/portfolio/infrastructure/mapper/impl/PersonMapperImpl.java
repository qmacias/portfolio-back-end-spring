package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.model.PersonDtoBuilder;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.entity.PersonEntityBuilder;

import org.example.portfolio.infrastructure.mapper.*;

import java.util.Set;

import com.google.common.collect.Sets;
import org.hibernate.cfg.NotYetImplementedException;

public class PersonMapperImpl implements PersonMapper {

    public PersonMapperImpl() {
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {
        return new PersonEntityBuilder()
                .setId(this.checkIdentity(personDto.getId()))
                .setName(personDto.getName())
                .setBirthdate(personDto.getBirthdate())
                .setDegree(personDto.getDegree())
                .setEmail(personDto.getEmail())
                .setSummary(personDto.getSummary())
                .setImageEntity(ImageMapper.INSTANCE.mapDtoToEntity(personDto.getImageDto()))
                .setPhoneEntities(PhoneMapper.INSTANCE.mapDtoSetToEntitySet(personDto.getPhoneDtoSet()))
                .setAddressEntities(AddressMapper.INSTANCE.mapDtoSetToEntitySet(personDto.getAddressDtoSet()))
                .setSocialEntities(SocialMapper.INSTANCE.mapDtoSetToEntitySet(personDto.getSocialDtoSet()))
                .setJobEntities(JobMapper.INSTANCE.mapDtoSetToEntitySet(personDto.getJobDtoSet()))
                .createPersonEntity();
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {
        return new PersonDtoBuilder()
                .setId(personEntity.getId())
                .setName(personEntity.getName())
                .setBirthdate(personEntity.getBirthdate())
                .setDegree(personEntity.getDegree())
                .setEmail(personEntity.getEmail())
                .setSummary(personEntity.getSummary())
                .setImageDto(ImageMapper.INSTANCE.mapEntityToDto(personEntity.getImageEntity()))
                .setPhoneDtoSet(PhoneMapper.INSTANCE.mapEntitySetToDtoSet(personEntity.getPhoneEntities()))
                .setAddressDtoSet(AddressMapper.INSTANCE.mapEntitySetToDtoSet(personEntity.getAddressEntities()))
                .setSocialDtoSet(SocialMapper.INSTANCE.mapEntitySetToDtoSet(personEntity.getSocialEntities()))
                .setJobDtoSet(JobMapper.INSTANCE.mapEntitySetToDtoSet(personEntity.getJobEntities()))
                .createPersonDto();
    }

    @Override
    public Set<PersonDto> mapEntitySetToDtoSet(Set<PersonEntity> personEntities) {
        throw  new NotYetImplementedException();
    }

    @Override
    public Set<PersonEntity> mapDtoSetToEntitySet(Set<PersonDto> personDtoSet) {

        Set<PersonEntity> personEntities = Sets.newHashSet();

        personDtoSet.forEach(personDto -> personEntities.add(
                this.mapDtoToEntity(personDto)
        ));

        return personEntities;
    }

}
