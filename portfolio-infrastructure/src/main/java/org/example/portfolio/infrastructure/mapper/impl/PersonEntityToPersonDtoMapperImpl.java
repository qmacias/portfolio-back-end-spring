package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonDtoToPersonEntityMapper;
import org.example.portfolio.infrastructure.mapper.PersonEntityToPersonDtoMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class PersonEntityToPersonDtoMapperImpl implements PersonEntityToPersonDtoMapper {

    private ModelMapper modelMapper;

    private PersonEntityToPersonDtoMapperImpl() {

        modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<PersonEntity, PersonDto>() {

            @Override
            protected void configure() {
                map().getImage().setId(source.getImageEntity().getId());
                map().getImage().setPath(source.getImageEntity().getPath());
            }
        });
    }

    private static class Holder {
        static final PersonEntityToPersonDtoMapper
                TO_PERSON_DTO_MAPPER = new PersonEntityToPersonDtoMapperImpl();
    }

    public static PersonEntityToPersonDtoMapper getInstance() {
        return PersonEntityToPersonDtoMapperImpl.Holder.TO_PERSON_DTO_MAPPER;
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {
        return modelMapper.map(personEntity, PersonDto.class);
    }

}
