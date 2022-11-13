package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.ToPersonDtoMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.List;
import java.util.stream.Collectors;

public class ToPersonDtoMapperImpl implements ToPersonDtoMapper {

    private ModelMapper modelMapper;

    private ToPersonDtoMapperImpl() {

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
        static final ToPersonDtoMapper
                TO_PERSON_DTO_MAPPER = new ToPersonDtoMapperImpl();
    }

    public static ToPersonDtoMapper getInstance() {
        return ToPersonDtoMapperImpl.Holder.TO_PERSON_DTO_MAPPER;
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {
        return modelMapper.map(personEntity, PersonDto.class);
    }

    @Override
    public List<PersonDto> mapEntityListToDtoList(List<PersonEntity> personEntityList) {
        return personEntityList.stream()
                .map(personEntity -> modelMapper.map(personEntity, PersonDto.class))
                .collect(Collectors.toList());
    }

}
