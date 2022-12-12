package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.AchievementDto;
import org.example.portfolio.domain.common.GenericModelMapper;

import org.example.portfolio.infrastructure.entity.AchievementEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public abstract class AchievementMapper extends GenericModelMapper<AchievementDto, AchievementEntity> {
    public static final AchievementMapper INSTANCE = ModelMapperFactory.getFactory().getAchievementMapperInstance();
}
