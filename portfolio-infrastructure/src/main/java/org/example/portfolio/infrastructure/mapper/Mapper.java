package org.example.portfolio.infrastructure.mapper;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Component;

@Component
public interface Mapper {

    ModelMapper INSTANCE = new ModelMapper();

}
