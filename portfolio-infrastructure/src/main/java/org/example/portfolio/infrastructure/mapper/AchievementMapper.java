package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.AchievementDto;
import org.example.portfolio.domain.common.ObjectModelMapper;
import org.example.portfolio.domain.common.CollectionModelMapper;

import org.example.portfolio.infrastructure.entity.AchievementEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

import java.util.Set;

public interface AchievementMapper extends
        ObjectModelMapper<AchievementDto, AchievementEntity>, CollectionModelMapper<Set<AchievementDto>, Set<AchievementEntity>> {
    AchievementMapper INSTANCE = ModelMapperFactory.getFactory().getAchievementMapperInstance();
}
