package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.AchievementDto;

import org.example.portfolio.infrastructure.entity.AchievementEntity;
import org.example.portfolio.infrastructure.mapper.AchievementMapper;

import java.util.Set;

import com.google.common.collect.Sets;

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
    public Set<AchievementDto> mapEntitySetToDtoSet(Set<AchievementEntity> achievementEntities) {

        Set<AchievementDto> achievementDtoSet = Sets.newHashSet();

        achievementEntities.forEach(achievementEntity -> achievementDtoSet.add(
                this.mapEntityToDto(achievementEntity)
        ));

        return achievementDtoSet;
    }

    @Override
    public Set<AchievementEntity> mapDtoSetToEntitySet(Set<AchievementDto> achievementDtoSet) {

        Set<AchievementEntity> achievementEntities = Sets.newHashSet();

        achievementDtoSet.forEach(achievementDto -> achievementEntities.add(
                this.mapDtoToEntity(achievementDto)
        ));

        return achievementEntities;
    }

}
