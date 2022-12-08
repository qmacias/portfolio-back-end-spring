package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.AddressDto;
import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.example.portfolio.domain.common.GenericModelMapper;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface AddressMapper extends GenericModelMapper<AddressDto, AddressEntity> {
    AddressMapper INSTANCE = ModelMapperFactory.getFactory().getAddressMapperInstance();
}
