package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.PersonDto;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonDtoToPersonEntityMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class PersonDtoToPersonEntityMapperImpl implements PersonDtoToPersonEntityMapper {

    private ModelMapper modelMapper;

    public PersonDtoToPersonEntityMapperImpl() {

        modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<PersonDto, PersonEntity>() {

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
