package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class PersonMapperImpl implements PersonMapper {

    private ModelMapper modelMapper;

    private PersonMapperImpl() {
    }

    private static class Holder {
        static final PersonMapperImpl PERSON_MAPPER = new PersonMapperImpl();
    }

    public static PersonMapperImpl getInstance() {
        return Holder.PERSON_MAPPER;
    }

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {

        this.modelMapper = new ModelMapper();

        TypeMap<PersonEntity, PersonDto> propertyEntityToDtoMapper =
                this.modelMapper.createTypeMap(PersonEntity.class, PersonDto.class);

        propertyEntityToDtoMapper.addMappings(
                mapper -> mapper.map(src -> src.getImageEntity(), PersonDto::setImage)
        );

        return this.modelMapper.map(personEntity, PersonDto.class);
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {

        this.modelMapper = new ModelMapper();

        TypeMap<PersonDto, PersonEntity> propertyDtoToEntityMapper =
                this.modelMapper.createTypeMap(PersonDto.class, PersonEntity.class);

        propertyDtoToEntityMapper.addMappings(
                mapper -> mapper.map(src -> src.getImage(), PersonEntity::setImageEntity)
        );

        return this.modelMapper.map(personDto, PersonEntity.class);
    }

}
