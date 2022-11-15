package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.example.portfolio.infrastructure.mapper.ToPersonEntityMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ToPersonEntityMapperImpl implements ToPersonEntityMapper {

    private ModelMapper modelMapper;

    public ToPersonEntityMapperImpl(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;

        this.modelMapper.addMappings(new PropertyMap<PersonDto, PersonEntity>() {

            @Override
            protected void configure() {
                map().getImageEntity().setId(source.getImage().getId());
                map().getImageEntity().setPath(source.getImage().getPath());
            }
        });
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {
        return modelMapper.map(personDto, PersonEntity.class);
    }

}
