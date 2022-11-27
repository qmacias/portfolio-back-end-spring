package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.common.RequestModelMapper;
import org.example.portfolio.domain.common.ResponseModelMapper;
import org.example.portfolio.domain.model.AddressDto;
import org.example.portfolio.infrastructure.entity.AddressEntity;

public interface AddressMapper extends
        RequestModelMapper<AddressDto, AddressEntity>, ResponseModelMapper<AddressEntity, AddressDto> {
}
