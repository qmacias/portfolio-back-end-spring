package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonEntityToPersonDtoMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class PersonEntityToPersonDtoMapperImpl implements PersonEntityToPersonDtoMapper {

    private ModelMapper modelMapper;

    public PersonEntityToPersonDtoMapperImpl() {

        modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<PersonEntity, PersonDto>() {

            @Override
            protected void configure() {
                map().getImage().setId(source.getImageEntity().getId());
                map().getImage().setPath(source.getImageEntity().getPath());
            }
        });
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {
        return modelMapper.map(personEntity, PersonDto.class);
    }

}
