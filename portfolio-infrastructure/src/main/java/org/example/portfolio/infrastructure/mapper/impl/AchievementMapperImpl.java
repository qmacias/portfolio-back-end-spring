package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.AchievementDto;

import org.example.portfolio.infrastructure.entity.AchievementEntity;
import org.example.portfolio.infrastructure.mapper.AchievementMapper;

import java.util.List;

import com.google.common.collect.Lists;

public class AchievementMapperImpl extends AchievementMapper {

    public AchievementMapperImpl() {
    }

    @Override
    public AchievementEntity mapDtoToEntity(AchievementDto achievementDto) {
        return AchievementEntity.of(this.checkIdentity(achievementDto.getId()), achievementDto.getDescription());
    }

    @Override
    public AchievementDto mapEntityToDto(AchievementEntity achievementEntity) {
        return AchievementDto.of(achievementEntity.getId(), achievementEntity.getDescription());
    }

    @Override
    public List<AchievementDto> mapEntityListToDtoList(List<AchievementEntity> achievementEntities) {

        List<AchievementDto> achievementDtoList = Lists.newArrayList();

        achievementEntities.forEach(achievementEntity -> achievementDtoList.add(
                this.mapEntityToDto(achievementEntity)
        ));

        return achievementDtoList;
    }

    @Override
    public List<AchievementEntity> mapDtoListToEntityList(List<AchievementDto> achievementDtoList) {

        List<AchievementEntity> achievementEntities = Lists.newArrayList();

        achievementDtoList.forEach(achievementDto -> achievementEntities.add(
                this.mapDtoToEntity(achievementDto)
        ));

        return achievementEntities;
    }

}
