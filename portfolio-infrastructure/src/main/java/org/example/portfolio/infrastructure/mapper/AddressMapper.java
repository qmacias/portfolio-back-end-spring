package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.AddressDto;
import org.example.portfolio.domain.common.ObjectModelMapper;
import org.example.portfolio.domain.common.CollectionModelMapper;

import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

import java.util.Set;

public interface AddressMapper extends
        ObjectModelMapper<AddressDto, AddressEntity>, CollectionModelMapper<Set<AddressDto>, Set<AddressEntity>> {
    AddressMapper INSTANCE = ModelMapperFactory.getFactory().getAddressMapperInstance();
}
