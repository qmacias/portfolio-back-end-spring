package org.example.portfolio.infrastructure.mapper.impl;

import com.google.common.collect.Lists;
import org.example.portfolio.domain.model.DurationDto;
import org.example.portfolio.infrastructure.entity.DurationEntity;
import org.example.portfolio.infrastructure.mapper.DurationMapper;

import java.util.List;

public class DurationMapperImpl extends DurationMapper {

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
    public List<DurationDto> mapEntityListToDtoList(List<DurationEntity> durationEntities) {

        List<DurationDto> durationDtoList = Lists.newArrayList();

        durationEntities.forEach(durationEntity -> durationDtoList.add(
                this.mapEntityToDto(durationEntity)
        ));

        return durationDtoList;
    }

    @Override
    public List<DurationEntity> mapDtoListToEntityList(List<DurationDto> durationDtoList) {

        List<DurationEntity> durationEntities = Lists.newArrayList();

        durationDtoList.forEach(durationDto -> durationEntities.add(
                this.mapDtoToEntity(durationDto)
        ));

        return durationEntities;
    }

}
