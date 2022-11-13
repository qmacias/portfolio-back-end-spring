package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.ToPersonEntityMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ToPersonEntityMapperImpl implements ToPersonEntityMapper {

    private ModelMapper modelMapper;

    private ToPersonEntityMapperImpl() {

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
        static final ToPersonEntityMapper
                TO_PERSON_ENTITY_MAPPER = new ToPersonEntityMapperImpl();
    }

    public static ToPersonEntityMapper getInstance() {
        return ToPersonEntityMapperImpl.Holder.TO_PERSON_ENTITY_MAPPER;
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {
        return modelMapper.map(personDto, PersonEntity.class);
    }

}
