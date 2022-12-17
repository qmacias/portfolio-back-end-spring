package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.JobDto;
import org.example.portfolio.domain.model.JobDtoBuilder;

import org.example.portfolio.infrastructure.entity.JobEntity;
import org.example.portfolio.infrastructure.entity.JobEntityBuilder;

import org.example.portfolio.infrastructure.mapper.DurationMapper;
import org.example.portfolio.infrastructure.mapper.JobMapper;
import org.example.portfolio.infrastructure.mapper.AchievementMapper;

import java.util.Set;

import com.google.common.collect.Sets;

public class JobMapperImpl implements JobMapper {

    public JobMapperImpl() {
    }

    @Override
    public JobEntity mapDtoToEntity(JobDto jobDto) {
        return new JobEntityBuilder()
                .setId(this.checkIdentity(jobDto.getId()))
                .setPosition(jobDto.getPosition())
                .setDescription(jobDto.getDescription())
                .setDuration(DurationMapper.INSTANCE.mapDtoToEntity(jobDto.getDuration()))
                .setAchievementEntities(AchievementMapper.INSTANCE.mapDtoSetToEntitySet(jobDto.getAchievementDtoSet()))
                .createJobEntity();
    }

    @Override
    public JobDto mapEntityToDto(JobEntity jobEntity) {
        return new JobDtoBuilder()
                .setId(jobEntity.getId())
                .setPosition(jobEntity.getPosition())
                .setDescription(jobEntity.getDescription())
                .setDuration(DurationMapper.INSTANCE.mapEntityToDto(jobEntity.getDurationEntity()))
                .setAchievementDtoSet(AchievementMapper.INSTANCE.mapEntitySetToDtoSet(jobEntity.getAchievementEntities()))
                .createJobDto();
    }

    @Override
    public Set<JobDto> mapEntitySetToDtoSet(Set<JobEntity> jobEntities) {

        Set<JobDto> jobDtoSet = Sets.newHashSet();

        jobEntities.forEach(jobEntity -> jobDtoSet.add(
                this.mapEntityToDto(jobEntity)
        ));

        return jobDtoSet;
    }

    @Override
    public Set<JobEntity> mapDtoSetToEntitySet(Set<JobDto> jobDtoSet) {

        Set<JobEntity> jobEntities = Sets.newHashSet();

        jobDtoSet.forEach(jobDto -> jobEntities.add(
                this.mapDtoToEntity(jobDto)
        ));

        return jobEntities;
    }

}
