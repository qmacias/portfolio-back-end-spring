package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonDtoToPersonEntityMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class PersonDtoToPersonEntityMapperImpl implements PersonDtoToPersonEntityMapper {

    private ModelMapper modelMapper;

    private PersonDtoToPersonEntityMapperImpl() {

        modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<PersonDto, PersonEntity>() {

            @Override
            protected void configure() {
                map().getImageEntity().setId(source.getImage().getId());
                map().getImageEntity().setPath(source.getImage().getPath());
            }
        });
    }

    private static class Holder {
        static final PersonDtoToPersonEntityMapper
                TO_PERSON_ENTITY_MAPPER = new PersonDtoToPersonEntityMapperImpl();
    }

    public static PersonDtoToPersonEntityMapper getInstance() {
        return PersonDtoToPersonEntityMapperImpl.Holder.TO_PERSON_ENTITY_MAPPER;
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {
        return modelMapper.map(personDto, PersonEntity.class);
    }

}
