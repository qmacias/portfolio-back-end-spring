package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.usecase.DtoToEntityMapperUseCase;
import org.example.portfolio.domain.usecase.EntityToDtoMapperUseCase;

import org.example.portfolio.infrastructure.entity.PhoneEntity;

public interface ToPhoneDtoOrEntityMapper extends
        EntityToDtoMapperUseCase<PhoneEntity, PhoneDto>, DtoToEntityMapperUseCase<PhoneDto, PhoneEntity> {
}
