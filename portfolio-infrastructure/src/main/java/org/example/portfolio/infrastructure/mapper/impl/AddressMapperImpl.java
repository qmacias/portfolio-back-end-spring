package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.AddressDto;

import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.example.portfolio.infrastructure.mapper.AddressMapper;

import java.util.Set;

import com.google.common.collect.Sets;

public class AddressMapperImpl implements AddressMapper {

    public AddressMapperImpl() {
    }

    @Override
    public AddressEntity mapDtoToEntity(AddressDto addressDto) {
        return AddressEntity.of(this.checkIdentity(addressDto.getId()), addressDto.getType(), addressDto.getDescription());
    }

    @Override
    public AddressDto mapEntityToDto(AddressEntity addressEntity) {
        return AddressDto.of(addressEntity.getId(), addressEntity.getType(), addressEntity.getDescription());
    }

    @Override
    public Set<AddressDto> mapEntitySetToDtoSet(Set<AddressEntity> addressEntities) {

        Set<AddressDto> addressDtoSet = Sets.newHashSet();

        addressEntities.forEach(addressEntity -> addressDtoSet.add(
                this.mapEntityToDto(addressEntity)
        ));

        return addressDtoSet;
    }

    @Override
    public Set<AddressEntity> mapDtoSetToEntitySet(Set<AddressDto> addressDtoSet) {

        Set<AddressEntity> addressEntities = Sets.newHashSet();

        addressDtoSet.forEach(addressDto -> addressEntities.add(
                this.mapDtoToEntity(addressDto)
        ));

        return addressEntities;
    }

}
