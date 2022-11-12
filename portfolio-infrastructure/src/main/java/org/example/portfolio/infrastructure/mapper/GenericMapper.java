package org.example.portfolio.infrastructure.mapper;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Component;

@Component
public interface GenericMapper<E, D> {

    D mapEntityToDto(E sourceEntity);

    E mapDtoToEntity(D sourceDto);

}
