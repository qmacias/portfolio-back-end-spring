package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;

import java.util.Set;

import com.google.common.collect.Sets;

public class PhoneMapperImpl extends PhoneMapper {

    public PhoneMapperImpl() {
    }

    @Override
    public PhoneEntity mapDtoToEntity(PhoneDto phoneDto) {
        return PhoneEntity.of(this.checkIdentity(phoneDto.getId()), phoneDto.getType(), phoneDto.getNumber());
    }

    @Override
    public PhoneDto mapEntityToDto(PhoneEntity phoneEntity) {
        return PhoneDto.of(phoneEntity.getId(), phoneEntity.getType(), phoneEntity.getNumber());
    }

    @Override
    public Set<PhoneDto> mapEntitySetToDtoSet(Set<PhoneEntity> phoneEntities) {

        Set<PhoneDto> phoneDtoSet = Sets.newHashSet();

        phoneEntities.forEach(phoneEntity -> phoneDtoSet.add(
                this.mapEntityToDto(phoneEntity)
        ));

        return phoneDtoSet;
    }

    @Override
    public Set<PhoneEntity> mapDtoSetToEntitySet(Set<PhoneDto> phoneDtoSet) {

        Set<PhoneEntity> phoneEntities = Sets.newHashSet();

        phoneDtoSet.forEach(phoneDto -> phoneEntities.add(
                this.mapDtoToEntity(phoneDto)
        ));

        return phoneEntities;
    }

}
