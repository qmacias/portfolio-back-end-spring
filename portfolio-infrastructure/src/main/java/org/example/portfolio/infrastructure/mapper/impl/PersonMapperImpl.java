package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class PersonMapperImpl implements PersonMapper {

    private PersonMapperImpl() {
    }

    private static class Holder {
        static final PersonMapperImpl PERSON_MAPPER = new PersonMapperImpl();
    }

    public static PersonMapperImpl getInstance() {
        return Holder.PERSON_MAPPER;
    }

    private ModelMapper mapper = null;

    @Override
    public PersonDto mapEntityToDto(PersonEntity personEntity) {

        mapper = new ModelMapper();

        TypeMap<PersonEntity, PersonDto> propertyEntityToDtoMapper =
                this.mapper.createTypeMap(PersonEntity.class, PersonDto.class);

        propertyEntityToDtoMapper.addMappings(
                mapper -> mapper.map(src -> src.getImageEntity(), PersonDto::setImage)
        );

        return this.mapper.map(personEntity, PersonDto.class);
    }

    @Override
    public PersonEntity mapDtoToEntity(PersonDto personDto) {

        mapper = new ModelMapper();

        TypeMap<PersonDto, PersonEntity> propertyDtoToEntityMapper =
                this.mapper.createTypeMap(PersonDto.class, PersonEntity.class);

        propertyDtoToEntityMapper.addMappings(
                mapper -> mapper.map(src -> src.getImage(), PersonEntity::setImageEntity)
        );

        return this.mapper.map(personDto, PersonEntity.class);
    }

}
