package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.common.RequestModelMapperComponent;
import org.example.portfolio.domain.common.ResponseModelMapperComponent;
import org.example.portfolio.infrastructure.entity.PhoneEntity;

public interface PhoneMapper extends
        RequestModelMapperComponent<PhoneDto, PhoneEntity>, ResponseModelMapperComponent<PhoneEntity, PhoneDto> {
}
