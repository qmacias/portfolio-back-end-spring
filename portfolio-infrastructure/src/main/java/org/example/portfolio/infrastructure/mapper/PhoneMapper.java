package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.usecase.RequestModelMapperUseCase;
import org.example.portfolio.domain.usecase.ResponseModelMapperUseCase;

import org.example.portfolio.infrastructure.entity.PhoneEntity;

public interface PhoneMapper extends
        RequestModelMapperUseCase<PhoneDto, PhoneEntity>, ResponseModelMapperUseCase<PhoneEntity, PhoneDto> {
}
