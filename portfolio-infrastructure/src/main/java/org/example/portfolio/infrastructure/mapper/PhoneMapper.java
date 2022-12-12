package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.common.GenericModelMapper;

import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public abstract class PhoneMapper extends GenericModelMapper<PhoneDto, PhoneEntity> {
    public static final PhoneMapper INSTANCE = ModelMapperFactory.getFactory().getPhoneMapperInstance();
}
