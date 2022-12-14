package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.DurationDto;

import org.example.portfolio.infrastructure.entity.DurationEntity;
import org.example.portfolio.infrastructure.mapper.DurationMapper;

import java.util.Set;

import com.google.common.collect.Sets;

public class DurationMapperImpl implements DurationMapper {

    public DurationMapperImpl() {
    }

    @Override
    public DurationEntity mapDtoToEntity(DurationDto durationDto) {
        return DurationEntity.of(this.checkIdentity(durationDto.getId()), durationDto.getStartDate(), durationDto.getFinishDate());
    }

    @Override
    public DurationDto mapEntityToDto(DurationEntity durationEntity) {
        return DurationDto.of(durationEntity.getId(), durationEntity.getStartDate(), durationEntity.getFinishDate());
    }

    @Override
    public Set<DurationDto> mapEntitySetToDtoSet(Set<DurationEntity> durationEntities) {

        Set<DurationDto> durationDtoSet = Sets.newHashSet();

        durationEntities.forEach(durationEntity -> durationDtoSet.add(
                this.mapEntityToDto(durationEntity)
        ));

        return durationDtoSet;
    }

    @Override
    public Set<DurationEntity> mapDtoSetToEntitySet(Set<DurationDto> durationDtoSet) {

        Set<DurationEntity> durationEntities = Sets.newHashSet();

        durationDtoSet.forEach(durationDto -> durationEntities.add(
                this.mapDtoToEntity(durationDto)
        ));

        return durationEntities;
    }

}
