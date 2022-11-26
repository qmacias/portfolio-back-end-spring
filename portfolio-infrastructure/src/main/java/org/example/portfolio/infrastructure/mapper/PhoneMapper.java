package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.common.RequestModelMapper;
import org.example.portfolio.domain.common.ResponseModelMapper;
import org.example.portfolio.infrastructure.entity.PhoneEntity;

public interface PhoneMapper extends
        RequestModelMapper<PhoneDto, PhoneEntity>, ResponseModelMapper<PhoneEntity, PhoneDto> {
}
