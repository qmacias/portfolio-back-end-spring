package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.common.ObjectModelMapper;
import org.example.portfolio.domain.common.CollectionModelMapper;

import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

import java.util.Set;

public interface PhoneMapper extends
        ObjectModelMapper<PhoneDto, PhoneEntity>, CollectionModelMapper<Set<PhoneDto>, Set<PhoneEntity>> {
    PhoneMapper INSTANCE = ModelMapperFactory.getFactory().getPhoneMapperInstance();
}
