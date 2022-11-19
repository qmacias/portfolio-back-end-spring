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
                map().getPhoneEntities().stream()
                        .forEach(phoneEntity -> source.getPhones().stream()
                                .forEach(phoneDto -> {
                                    phoneEntity.setId(phoneDto.getId());
                                    phoneEntity.setType(phoneDto.getType());
                                    phoneEntity.setNumber(phoneDto.getNumber());
                                })
                        );
                // FIX: IT DOESN'T WORK! Exception with phonesEntityList mapping
            }
        });
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {
        return modelMapper.map(personDto, PersonEntity.class);
    }

}
