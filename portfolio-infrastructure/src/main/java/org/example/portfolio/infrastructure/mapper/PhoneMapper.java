package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.domain.common.GenericModelMapper;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface PhoneMapper extends GenericModelMapper<PhoneDto, PhoneEntity> {
    PhoneMapper INSTANCE = ModelMapperFactory.getFactory().getPhoneMapperInstance();
}
